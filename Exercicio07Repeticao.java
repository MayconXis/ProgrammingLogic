package LogicaProgramacao;

import java.util.Scanner;
public class Exercicio07Repeticao {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero;
        Numero = sc.nextInt();
        while (Numero != 2002) {
            System.out.println("Senha Invalida");
            Numero = sc.nextInt();
        }
         System.out.println("Acesso Permitido");
        sc.close();
  }
}
