package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

public class TestPU {

    @Test
    @DisplayName("Obtenemos el texto FACE si el parámetro que pasamos es múltiplo de 3")
    void multiplo3() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo1(3);
        // 3 - Aserciones
        assertEquals("Face", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el texto Book si el parámetro que pasamos es múltiplo de 5")
    void multiplo5() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo1(5);
        // 3 - Aserciones
        assertEquals("Book", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el texto Facebook si el parámetro que pasamos es múltiplo de 15")
    void multiplo15() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo1(15);
        // 3 - Aserciones
        assertEquals("Facebook", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el mismo parámetro si no es múltiplo de 3, 5 o 15")
    void NoMultiplosAnteriores() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo1(8);
        // 3 - Aserciones
        assertEquals("8", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el texto 1 2 Face cuando pasamos un array con los valores {1,2,3}")
    void array1() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        int [] array = {1,2,3};
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo2(array);
        // 3 - Aserciones
        assertEquals("1 2 Face", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el texto 1 2 Face cuando pasamos un array con los valores {1,2,3}")
    void array2() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        int [] array = {6,10,30};
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo2(array);
        // 3 - Aserciones
        assertEquals("Face Book Facebook", comprobacion);
    }

    @Test
    @DisplayName("Obtenemos el texto 1 2 Face cuando pasamos un array con los valores {1,2,3}")
    void array3() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        RespuestasParametros test = new RespuestasParametros();
        int [] array = {4,6,8};
        // 2 - Ejecutar lo que vamos a validar
        String comprobacion = test.metodo2(array);
        // 3 - Aserciones
        assertEquals("4 6 8", comprobacion);
    }

}