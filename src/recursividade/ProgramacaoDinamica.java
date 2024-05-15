package recursividade;

public class ProgramacaoDinamica {

    private static final int MAX_ELEMENTS = 100;

    private static final long[] elementosFat = new long[MAX_ELEMENTS];

    public static long encontrarFatorialPD(int n) {
        for (int i = 0; i < MAX_ELEMENTS ; i++) {
            elementosFat[i] = -1;
        }
        return encontrarFatorialPD(n);
    }

    public static long encontrarFatorial(int n) {
        if (elementosFat[n] == -1) {
            if (n < 1) {
                elementosFat[n] = n;
            } else {
                elementosFat[n] = encontrarFatorial(n) * encontrarFatorial(n-1);
            }
        }
        return elementosFat[n];
    }

    public static void main(String[] args) {
        int n = 100;

        System.out.println("Fatorial de " + n + " é: " + encontrarFatorialPD(n));
    }
}
