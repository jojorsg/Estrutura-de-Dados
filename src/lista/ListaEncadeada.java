package lista;

import java.util.EmptyStackException;

public class ListaEncadeada {

    private Node head;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public void push(int valor) {
        Node novoNo = new Node(valor);
        if (head == null) {
            head = novoNo;
        } else {
            Node temp = head;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novoNo);
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node removido = head;
        head = head.getProximo();
        size--;
        return removido;
    }

    public void insert(int index, int valor) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        Node novoNo = new Node(valor);
        if (index == 0) {
            novoNo.setProximo(head);
            head = novoNo;
        } else {
            Node anterior = head;
            for (int i = 0; i < index - 1; i++) {
                anterior = anterior.getProximo();
            }
            novoNo.setProximo(anterior.getProximo());
            anterior.setProximo(novoNo);
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        if (index == 0) {
            head = head.getProximo();
        } else {
            Node anterior = head;
            for (int i = 0; i < index - 1; i++) {
                anterior = anterior.getProximo();
            }
            anterior.setProximo(anterior.getProximo().getProximo());
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        Node atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public int size() {
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }
        Node atual = head;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.getValor());
            if (atual.getProximo() != null) {
                System.out.print(", ");
            }
            atual = atual.getProximo();
        }
        System.out.println("]");
    }
}