package ejecicio3exaemn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

    @CsvSource({
        "1,lunes",
        "2,martes",
        "3,miercoles",
        "4,jueves",
        "5,viernes",
        "6,sabado",
        "7,domingo",
        "8,Error!"})
    
    @ParameterizedTest(name = "Prueba {index} => Con valor {0} sale {1}")
    void testCadena_parametrized(int x, String cadena) {
        // Arrange
        Ejercicio3 e3 = new Ejercicio3();
        // Act
        // Assert
        assertEquals(cadena, e3.diaSemana(x));
    }
}
