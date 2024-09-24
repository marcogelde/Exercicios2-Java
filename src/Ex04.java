import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        var n2 = sc.nextInt();

        soma(n1, n2);
        sc.close();
    }

    private static void soma(int n1, int n2) {
        var soma = n1 + n2;
        System.out.println("A soma é: " + soma);
    }
}
