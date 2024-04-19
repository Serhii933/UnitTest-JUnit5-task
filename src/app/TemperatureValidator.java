package app;

import java.util.Scanner;

public class TemperatureValidator {

    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;

    public void validateTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            throw new TemperatureOutOfRangeException("Температура знаходиться поза межами допустимого діапазону");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureValidator validator = new TemperatureValidator();

        System.out.print("Введіть температуру: ");
        int temperature = scanner.nextInt();

        try {
            validator.validateTemperature(temperature);
            System.out.println("Температура в межах допустимого діапазону.");
        } catch (TemperatureOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

