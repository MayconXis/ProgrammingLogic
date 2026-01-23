package LogicaProgramacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numF = sc.nextInt();
        double numT = sc.nextInt();
        double numV = sc.nextDouble();
        double salario = numT * numV;
        System.out.printf( "Number= " + numF  + "%n" + "Salary= " + salario );
        sc.close();

    }
}
