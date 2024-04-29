package fifo;

import java.util.EmptyStackException;

public class TesteFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Fundo da fila: " + fila.rear());

        int valorRemovido = fila.dequeue();
        System.out.println("Valor removido da fila: " + valorRemovido);

        System.out.println("Tamanho da fila após remoção: " + fila.size());
        System.out.println("Frente da fila após remoção: " + fila.front());
        System.out.println("Fundo da fila após remoção: " + fila.rear());

        fila.enqueue(40);
        fila.enqueue(50);

        System.out.println("Tamanho da fila após adição: " + fila.size());
        System.out.println("Frente da fila após adição: " + fila.front());
        System.out.println("Fundo da fila após adição: " + fila.rear());

        try {
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
        } catch (EmptyStackException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
