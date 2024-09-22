import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Inicializando
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        // Comparando os dois números
        if (n1 > n2) {
            System.out.println("O número maior é: " + n1);
        } else if (n1 < n2) {
            System.out.println("O número maior é: " + n2);
        } else System.out.println("Os números são iguais.");
    }
}