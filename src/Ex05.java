import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        var n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        var n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        var n3 = sc.nextInt();
        comparaMaior(n1, n2, n3);
    }

    private static void comparaMaior(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é o maior número.");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior número.");
        } else System.out.println(n3 + " é o maior número.");
    }
}