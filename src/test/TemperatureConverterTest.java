import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(32);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32, result, 0.01);
    }

    @Test
    public void testExtremeTemperatureBelow() {
        boolean result = converter.isExtremeTemperature(-50);
        assertTrue(result);
    }

    @Test
    public void testExtremeTemperatureAbove() {
        boolean result = converter.isExtremeTemperature(60);
        assertTrue(result);
    }

    @Test
    public void testNormalTemperature() {
        boolean result = converter.isExtremeTemperature(20);
        assertFalse(result);
    }
}
