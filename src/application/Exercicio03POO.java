package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03POO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
    
        Product product = new Product(name, price, quantity);
        System.out.println();

        product.setName("Computer");
        System.out.println("Updtaded name:" + product.getName());

        product.setPrice(1200.00);
        System.out.println("Updtaded price:" + product.getPrice());

        System.out.println("Quantity:" + product.getQuantity());

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        sc.close();

    }
}
