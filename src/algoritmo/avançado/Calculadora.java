package algoritmo.avançado;

public class Calculadora {

    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser somado.
     * @param b O segundo número inteiro a ser somado.
     * @return A soma de `a` e `b`.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de um número inteiro de outro.
     *
     * @param a O primeiro número inteiro (minuendo).
     * @param b O segundo número inteiro (subtraendo).
     * @return A diferença de `a` e `b`.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser multiplicado.
     * @param b O segundo número inteiro a ser multiplicado.
     * @return O produto de `a` e `b`.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de um número inteiro por outro.
     *
     * @param a O dividendo (número inteiro a ser dividido).
     * @param b O divisor (número inteiro pelo qual se divide).
     * @return O resultado da divisão de `a` por `b`.
     * @throws ArithmeticException Se `b` for igual a 0.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}
