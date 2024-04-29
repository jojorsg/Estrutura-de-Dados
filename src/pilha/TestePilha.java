package pilha;

import java.util.EmptyStackException;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.top());

        int valorRemovido = pilha.pop();
        System.out.println("Valor removido da pilha: " + valorRemovido);

        System.out.println("Tamanho da pilha após remoção: " + pilha.size());
        System.out.println("Topo da pilha após remoção: " + pilha.top());

        pilha.push(40);
        pilha.push(50);

        System.out.println("Tamanho da pilha após adição: " + pilha.size());
        System.out.println("Topo da pilha após adição: " + pilha.top());

        try {
            pilha.pop();
            pilha.pop();
            pilha.pop();
            pilha.pop();
            pilha.pop();
        } catch (EmptyStackException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
