import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Inicializando
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        var n2 = sc.nextInt();

        // Comparando os dois números
        comparar(n1, n2);

        // Fechar o Scanner
        sc.close();
    }

    private static void comparar(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("O número maior é: " + n1);
        } else if (n1 < n2) {
            System.out.println("O número maior é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
