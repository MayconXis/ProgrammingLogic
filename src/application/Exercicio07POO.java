package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("How many numbers are you going to type?");
        int n = sc.nextInt();
        double sum, average;
        sum = 0;
        double[] vect = new double[n];
        
        for(int i = 0; i < vect.length; i++) {
            System.out.println("Enter a number:");
            vect[i] = sc.nextDouble();
        }
        
        for(int i = 0; i < vect.length; i++) {
            sum = sum + vect[i];
        }

        average = sum / n;

       System.out.print("Values = ");

       for (int i = 0; i<vect.length; i++) {
        System.out.printf("%.1f  ",vect[i]);
       }

	    System.out.printf("\nSOMA = %.2f\n", sum);
	    System.out.printf("MEDIA = %.2f\n", average);

        sc.close();
    }
    
}
