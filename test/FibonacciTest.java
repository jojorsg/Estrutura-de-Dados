import algoritmo.avançado.Fibonacci;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void deveRetornarZeroParaPrimeiroElemento() {
        assertEquals(0, Fibonacci.encontrarElemento(0));
    }

    @Test
    public void deveRetornarUmParaSegundoElemento() {
        assertEquals(1, Fibonacci.encontrarElemento(1));
    }

    @Test
    public void deveRetornarCorretamenteSequenciaDeFibonacci() {
        for (int n = 2; n <= 10; n++) {
            int resultadoEsperado = Fibonacci.encontrarElemento(n - 1) + Fibonacci.encontrarElemento(n - 2);
            int resultadoAtual = Fibonacci.encontrarElemento(n);
            assertEquals(resultadoEsperado, resultadoAtual);
        }
    }

    @Test
    public void deveRetornarValorMaximoDeInteiroParaElementoGrande() {
        int n = 46;
        assertEquals(Integer.MAX_VALUE, Fibonacci.encontrarElemento(n));
    }
}
