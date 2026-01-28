package LogicaProgramacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13Repeticao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o inicio (A): ");
        int A = sc.nextInt();
        System.out.print("Digite o fim (b): ");
        int B = sc.nextInt();

        System.err.println("Números de Armstrong no intervalo [" + A + ", " + B + "]:");
    for (int i = A; i <= B; i++) {
        if (ehArmstrong(i)) {
            System.out.println(i);
        }
    }
 }
}

public static boolean ehArmstrong(int n) {
        int original = n;
        int numDigitos = String.valueOf(Math.abs(n)).length();
        double soma = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            int digito = temp % 10;
            soma += Math.pow(digito, numDigitos);
            temp /= 10;
        }
        return (int)soma == original;
    }
}
