import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        var n1 = sc.nextInt();

        // Definindo se o número é par ou impar
        parOuImpar(n1);
    }

    private static void parOuImpar(int n1) {
        if (n1 % 2 == 0) {
            System.out.println("Número par");
        } else System.out.println("Número impar");
    }
}