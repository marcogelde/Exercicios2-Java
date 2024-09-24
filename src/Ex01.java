import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        //Inicializado
        Scanner leitor = new Scanner(System.in);

        // Receba um numero inteiro
        final var numero = getNumero(leitor);

        //Verifique se ele é positivo, negativo ou zero.
        PositivoNegativoZero(numero);
    }

    private static int getNumero(Scanner leitor) {
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();
        return numero;
    }

    public static void PositivoNegativoZero(int numero) {
        if (numero > 0) {
            System.out.println("Este número é maior que 0");
        } else if (numero < 0) {
            System.out.println("Este número é menor que 0");
        } else {
            System.out.println("Este número é igual a 0");
        }
    }
}