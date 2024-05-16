package backtracking_e_algoritmo_guloso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> subconjuntos(int[] conjunto, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        subconjuntosRecursao(conjunto, n, 0, new ArrayList<>(), subconjuntos);
        return subconjuntos;
    }

    private static void subconjuntosRecursao(int[] conjunto, int n, int index, List<Integer> subconjuntoAtual, List<List<Integer>> subconjuntos) {
        if (subconjuntoAtual.size() == n) {
            subconjuntos.add(new ArrayList<>(subconjuntoAtual));
            return;
        }

        for (int i = index; i < conjunto.length; i++) {
            subconjuntoAtual.add(conjunto[i]);
            subconjuntosRecursao(conjunto, n, i + 1, subconjuntoAtual, subconjuntos);
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3, 4};
        int n = 3;

        List<List<Integer>> subconjuntos = subconjuntos(conjunto, n);
        System.out.println("Subconjuntos de tamanho " + n + " do conjunto " + Arrays.toString(conjunto) + ":");
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }
}
