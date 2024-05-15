package recursividade;

public class Recursao {

    public static int encontrarFatorial(int n) {
        if(n < 1) {
            return n;
        }
        return encontrarFatorial(n) * encontrarFatorial(n-1);
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Fatorial de " + n + " é: " + encontrarFatorial(n));
    }
}
