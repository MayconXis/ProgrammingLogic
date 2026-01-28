package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Exercicio02POO {

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price?");
    double  dollarPrice = sc.nextDouble();

    System.out.print("How maney dollar will be bought?: ");
    double  quantity = sc.nextDouble();

    double result = CurrencyConverter.convert(dollarPrice, quantity);
    System.out.printf("Amount to be paid in reais = %.2f%n", result);

    sc.close();
    }
}
