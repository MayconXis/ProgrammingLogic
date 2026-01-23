package LogicaProgramacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double AreaTri=  ((A * C ) / 2.0) ;
        double AreaCirc = (3.14159 * C * C);
        double AreaTrap = (((A + B) * C ) / 2);
        double AreaQuad = (B * B);
        double AreaRet = (A * B);
       	System.out.printf("TRIANGULO: %.3f%n", AreaTri);
		System.out.printf("CIRCULO: %.3f%n", AreaCirc);
		System.out.printf("TRAPEZIO: %.3f%n", AreaTrap);
		System.out.printf("QUADRADO: %.3f%n", AreaQuad);
		System.out.printf("RETANGULO: %.3f%n", AreaRet);
        sc.close();
    }
}
