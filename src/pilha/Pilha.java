package pilha;

import java.util.EmptyStackException;

public class Pilha {

    private int[] elementos;
    private int topo;

    public Pilha() {
        this.elementos = new int[10];
        this.topo = 0;
    }

    public void push(int valor) {
        if (topo == elementos.length) {
            expandirPilha();
        }
        elementos[topo] = valor;
        topo++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topo--;
        return elementos[topo];
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[topo - 1];
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public int size() {
        return topo;
    }

    private void expandirPilha() {
        int novoTamanho = elementos.length * 2;
        int[] novosElementos = new int[novoTamanho];
        System.arraycopy(elementos, 0, novosElementos, 0, elementos.length);
        elementos = novosElementos;
    }
}
