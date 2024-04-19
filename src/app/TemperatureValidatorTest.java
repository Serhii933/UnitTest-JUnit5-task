package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperatureValidatorTest {

    @Test
    void testValidTemperature() throws TemperatureOutOfRangeException {
        TemperatureValidator validator = new TemperatureValidator();
        validator.validateTemperature(20);
    }

    @Test
    void testLowerBoundTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> {
            validator.validateTemperature(-15);
        });
    }

    @Test
    void testUpperBoundTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> {
            validator.validateTemperature(40);
        });
    }
}
