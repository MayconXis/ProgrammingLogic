package LogicaProgramacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1 = sc.nextInt();
        int numpeca1 = sc.nextInt();
        double valorp1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int numpeca2 = sc.nextInt();
        double valorp2 = sc.nextDouble();
        double valorpagar = ((valorp1 * numpeca1) + (valorp2 * numpeca2) );
        System.out.printf("A=%.2f%n", valorpagar);
        sc.close();

    }
}
