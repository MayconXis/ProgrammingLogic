package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people you want type ?:");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for(int i = 0; i<n;i++){
            System.out.println("Type the name " + (i + 1) +"* person:");
             name[i] = sc.next();
            System.out.println("Type the age " + (i + 1) +"* person:");
             age[i] = sc.nextInt();
            System.out.println("Type the height " + (i + 1) +"* person:");
             height[i] = sc.nextDouble();
        }
        double sum = 0.0;
         for(int i = 0; i<n; i++){
          sum = sum + height[i];  
         }
         double averageHeight = sum / n;
         System.out.println("The media of the height is: " + averageHeight);

          int countAge = 0;
         for(int i = 0; i<n;i++){
          if (age[i] < 16 ) {
          countAge = countAge + 1; 
          } 
         }
         double porcent = (countAge * 100.0) / n;
         System.out.printf("The percentage of people under 16 is: %.1f%%%n" , porcent);
          for(int i = 0; i<n; i++){
            if (age[i] < 16){
                System.out.println(name[i]);
            }
          }
         sc.close();
    }


}
