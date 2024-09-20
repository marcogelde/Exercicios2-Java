import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é o maior número.");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior número.");
        } else System.out.println(n3 + " é o maior número.");
    }
}