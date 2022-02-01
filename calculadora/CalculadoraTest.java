import static org.junit.Assert.*;
import org.junit.Test;
public class CalculadoraTest {

    @Test
    public void testSuma() {
        int resultado = Calculadora. suma(2, 3);
        int esperado = 5; // 2 + 3 = 5
        assertEquals(esperado, resultado);
    }

    @Test
    public void testResta() {
        int resultado = Calculadora.resta(3, 2);
        int esperado = 1; // 3 - 2 = 1
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testMultiplicacion() {
        int resultado = Calculadora.multiplicacion(3, 2);
        int esperado = 6; // 3 * 2 = 6
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testDivision() {
        int resultado = Calculadora.division(4, 2);
        int esperado = 2; // 4 / 2 = 2
        assertEquals(esperado, resultado);
    }
}
