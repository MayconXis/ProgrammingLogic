package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductAvg;
public class Exercicio05POO {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        int n = sc.nextInt();
        ProductAvg[] vect = new ProductAvg[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductAvg(name, price);

        }
        double sum = 0.0;
            for (int i = 0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avarage = sum / n;
        System.out.printf("Avarage Price = %.2f%n", avarage);

        sc.close();
    }

}
