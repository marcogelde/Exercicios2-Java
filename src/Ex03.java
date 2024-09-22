import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();

        // Definindo se o número é par ou impar
        if (n1 % 2 == 0) {
            System.out.println("Número par");
        } else System.out.println("Número impar");
    }
}