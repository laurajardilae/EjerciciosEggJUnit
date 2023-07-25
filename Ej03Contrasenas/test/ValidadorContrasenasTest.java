import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorContrasenasTest {

    static ValidadorContrasenas vc;

    @BeforeAll
    public static void crearClase(){
        vc = new ValidadorContrasenas();
    }
    @Test
    public void contieneNumeros(){
        assertTrue(vc.numeros("hola123"));
    }
    @Test
    public void noContieneNumeros(){
        assertFalse(vc.numeros("holamundo"));
    }
    @Test
    public void ochoCaracteres(){
        assertTrue(vc.numeros("hola1234"));
    }
    @Test
    public void menosDeOchoCaracteres(){
        assertFalse(vc.numeros("holi"));
    }
}