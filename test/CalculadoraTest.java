import algoritmo.avançado.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisNumerosInteirosCorretamente() {
        int resultado = calculadora.adicionar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisNumerosInteirosCorretamente() {
        int resultado = calculadora.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void deveMultiplicarDoisNumerosInteirosCorretamente() {
        int resultado = calculadora.multiplicar(2, 6);
        assertEquals(12, resultado);
    }

    @Test
    public void deveDividirDoisNumerosInteirosCorretamente() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    public void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
