package fifo;

import java.util.EmptyStackException;

public class Fila {

    private int[] elementos;
    private int inicio;
    private int fim;

    public Fila() {
        this.elementos = new int[10];
        this.inicio = 0;
        this.fim = 0;
    }

    public void enqueue(int valor) {
        if (fim == elementos.length) {
            expandirFila();
        }
        elementos[fim] = valor;
        fim++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int valorRemovido = elementos[inicio];
        inicio++;
        return valorRemovido;
    }

    public int rear() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[fim - 1];
    }

    public int front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[inicio];
    }

    public int size() {
        return fim - inicio;
    }

    public boolean isEmpty() {
        return inicio == fim;
    }

    private void expandirFila() {
        int novoTamanho = elementos.length * 2;
        int[] novosElementos = new int[novoTamanho];
        System.arraycopy(elementos, inicio, novosElementos, 0, size());
        elementos = novosElementos;
        inicio = 0;
        fim = size();
    }
}
