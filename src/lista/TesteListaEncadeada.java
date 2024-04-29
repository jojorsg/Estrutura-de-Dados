package lista;

public class TesteListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(10);
        lista.push(20);
        lista.push(30);

        System.out.println("Tamanho da lista: " + lista.size());
        lista.printList();

        System.out.println("\nElemento no índice 1: " + lista.elementAt(1).getValor());

        lista.insert(1, 15);
        lista.printList();

        lista.remove(2);
        lista.printList();

        Node removido = lista.pop();
        System.out.println("\nElemento removido do fim: " + removido.getValor());
        lista.printList();

        try {
            lista.elementAt(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErro: " + e.getMessage());
        }

        try {
            lista.remove(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErro: " + e.getMessage());
        }

        lista.push(40);
        lista.push(50);
        lista.printList();
    }
}
