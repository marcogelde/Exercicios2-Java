import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        double numerador = scanner.nextDouble();

        System.out.print("Digite o denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
