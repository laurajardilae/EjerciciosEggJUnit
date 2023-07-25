import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    static TemperatureConverter tc;

    @BeforeAll
    public static void crear(){
        tc = new TemperatureConverter();
    }

    @Test
    public void celsiusToFahr0() {
        assertEquals(32,tc.celsiusToFahr(0));
    }
    @Test
    public void celsiusToFahr5() {
        assertEquals(41,tc.celsiusToFahr(5));
    }
}