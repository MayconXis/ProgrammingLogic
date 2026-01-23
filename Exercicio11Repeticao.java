package LogicaProgramacao;
import java.util.Scanner;
public class Exercicio11Repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um número real positivo (X): ");
        double x = scanner.nextDouble();

        if (x < 0) {
            System.out.println("Erro: O número deve ser positivo.");
        } else if (x == 0) {
            System.out.println("A raiz quadrada de 0 é 0.");
        } else {

            double tolerancia = 0.00001; // Precisão desejada
            double chute = x / 2.0;      // Palpite inicial
            int iteracoes = 0;
            // Enquanto a diferença absoluta entre (chute² e X) for maior que a tolerância
            while (Math.abs((chute * chute) - x) > tolerancia) {
                // Fórmula de Heron: g_novo = (g + (X/g)) / 2
                chute = (chute + (x / chute)) / 2.0;
                iteracoes++;
                
                System.out.printf("Iteração %d: Chute = %.6f%n", iteracoes, chute);
            }

            // 4. Resultado Final
            System.out.println("------------------------------------");
            System.out.printf("Raiz aproximada de %.2f: %.5f%n", x, chute);
            System.out.printf("Número de iterações necessárias: %d%n", iteracoes);
            System.out.printf("Raiz real (Math.sqrt): %.5f%n", Math.sqrt(x));
        }

        scanner.close();
    }
}