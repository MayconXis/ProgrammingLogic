package LogicaProgramacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int diferenca = ((a * b) - (c * d));
            System.out.println("DIFERENCA = " + ((a * b) - (c * d) + diferenca));
        }

    }
}
