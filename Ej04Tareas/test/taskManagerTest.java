import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class taskManagerTest {
    taskManager tm;

    @BeforeEach
    void setUp() {
        tm = new taskManager();
    }

    @Test
    void agregarTarea() {
        assertTrue(tm.agregarTarea("Hacer almuerzo"));
        assertTrue(tm.agregarTarea("Lavar ropa"));
    }

    @Test
    void listarTareas() {
        tm.agregarTarea("Hacer desayuno");
        tm.agregarTarea("Hacer cena");
        assertEquals("[Hacer desayuno, Hacer cena]",tm.listarTareas());
    }

    @Test
    void eliminarTarea() {
        tm.agregarTarea("Hacer desayuno");
        tm.agregarTarea("Hacer cena");
        assertEquals("Hacer desayuno",tm.eliminarTarea(0));

    }
}