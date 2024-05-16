package backtracking_e_algoritmo_guloso;

import java.util.Arrays;

public class TrocoGuloso {

    public static void main(String[] args) {
        // Exemplo 1
        int[] moedas1 = {5, 2, 1};
        int quantia1 = 18;
        System.out.println("Troco para quantia " + quantia1 + " com moedas " + Arrays.toString(moedas1) + ": " + trocoGuloso(moedas1, quantia1));

        // Exemplo 2
        int[] moedas2 = {4, 3, 2};
        int quantia2 = 11;
        System.out.println("Troco para quantia " + quantia2 + " com moedas " + Arrays.toString(moedas2) + ": " + trocoGuloso(moedas2, quantia2));
    }

    private static int trocoGuloso(int[] moedas, int quantia) {
        int troco = quantia;
        int[] trocoMoedas = new int[moedas.length];

        for (int i = moedas.length - 1; i >= 0; i--) {
            while (troco >= moedas[i]) {
                troco -= moedas[i];
                trocoMoedas[i]++;
            }
        }

        return Arrays.stream(trocoMoedas).sum();
    }
}
