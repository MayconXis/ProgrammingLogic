package LogicaProgramacao;
import java.util.Scanner;

public class Exercicio10Repeticao {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int A1, Q, N;
     A1 = sc.nextInt();
     Q = sc.nextInt();
     N = sc.nextInt();
     double soma = 0;
     for (int i = 0; i < N; i++) {
       soma = (A1 + Math.pow(Q, i));
     }
     System.out.println("Resultado: " + soma);
    }
   }