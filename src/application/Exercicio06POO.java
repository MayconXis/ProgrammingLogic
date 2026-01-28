package application;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio06POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Locale.setDefault(Locale.US);

        System.out.print("How many numbers are you going to type?");
        int n = sc.nextInt();

        int[] vect = new int[n];


        for(int i = 0; i<vect.length; i++){
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println("Negative Numbers: " );

        for(int i = 0; i<vect.length; i++){
            if(vect[i] < 0) {
              System.out.printf("%d\n", vect[i]);
            }
        }
        sc.close();
    }
}
