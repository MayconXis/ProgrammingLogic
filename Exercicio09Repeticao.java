package LogicaProgramacao;
import java.util.Scanner;

public class Exercicio09Repeticao {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int Combustivel;
        Combustivel = sc.nextInt();
        
        while (Combustivel != 4) {
            switch (Combustivel) {
                case 1:
                    alcool += 1;
                    break;
                case 2 :
                    gasolina += 1;
                    break;
                case 3 :
                    diesel += 1;
                    break;
                default:
                    break;
            }
            Combustivel = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}