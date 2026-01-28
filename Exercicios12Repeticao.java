package LogicaProgramacao;
import java.util.Scanner;

public class Exercicios12Repeticao {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número: ");
      int numeroOriginal = sc.nextInt();
      int temp = numeroOriginal;
      int numDigitos = 0;
     
      while (temp != 0) {
        temp /= 10;
        numDigitos++;
      }

      temp = numeroOriginal;
      double soma = 0;

      while (temp != 0) {
        int ultimoDigito = temp % 10;
        soma += Math.pow(ultimoDigito, numDigitos);
        temp /= 10;
      }

      if ((int)soma == numeroOriginal) {
        System.out.println(numeroOriginal + " é um número de Armstrong");
      }else{
        System.out.println(numeroOriginal + " não é um número de Armstrong.");
      }
    sc.close();
    }   
}
