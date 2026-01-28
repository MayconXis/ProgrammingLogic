package application;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio04POO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    sc.useLocale(Locale.US);
    
    int n = sc.nextInt();
    double[] vect = new double[n];

    for(int i = 0; i<n; i++) {
        vect[i] = sc.nextDouble();
    }

    double sum = 0.0;

    for(int i=0; i<n; i++){
        sum += vect[i];
    }
     double average = sum / n;
      System.out.println("Avarage Height: " + average);

    sc.close();
    }
}
