import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

   /* @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
*/
    public static Calculator c;
    @BeforeAll
    public static void crearCalculadora(){
        c = new Calculator();
    }


    @Test
    public void descuento10(){
        double resultado = c.productoEnDescuento(5000,10);
        assertEquals(4500, resultado);
    }

    @Test
    public void descuentoMaximo(){
        double resultado = c.productoEnDescuento(5000,100);
        assertEquals(0, resultado);
    }
    @Test
    public void sinDescuento(){
        double resultado = c.productoEnDescuento(5000,0);
        assertEquals(5000, resultado);
    }
}