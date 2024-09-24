import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        var numerador = scanner.nextDouble();

        System.out.print("Digite o denominador: ");
        var denominador = scanner.nextDouble();

        // Corrigindo a ordem dos parâmetros
        divisao(numerador, denominador);

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }

    private static void divisao(double numerador, double denominador) {
        if (denominador != 0) {
            var resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
