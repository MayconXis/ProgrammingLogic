package application;
import java.util.Scanner;

public class Exercicio10POO {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size in M ​​(Lines):");
    int m = sc.nextInt();
    System.out.print("Enter the size in N (Columns):");
    int n = sc.nextInt();

    int mat[][] = new int[m][n]; 
 
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < mat.length; i++ ){
        for(int j = 0; j < mat[i].length; j++){
            mat[i][j] = sc.nextInt();
        }
    }
    System.out.println();
    System.out.print("Enter the number X: ");
    int x = sc.nextInt();
 
    
    for(int i = 0; i < mat.length; i++) {
        for(int j = 0; j < mat[i].length; j++){

            if (mat[i][j] == x) {
                System.out.println("Position " + i + "," + j + ":");
            //Esquerda
            if (j > 0){
                System.out.println("Left: " + mat[i][j-1]);
            }

            //Acima
            if (i > 0) {
                System.out.println("Up: " + mat[i-1][j]);
            }
            //Direita
            if (j < mat[i].length - 1) {
                System.out.println("Right:" + mat[i][j+1]);
            }
            //Abaixo
            if(i < mat.length - 1) {
                System.out.println("Down: " + mat[i+1][j]);
            }
        }
      }
    }
    sc.close();
 }
    
}
