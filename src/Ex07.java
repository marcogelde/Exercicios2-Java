import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade < 0) {
            System.out.println("Idade indisponível");
        } else System.out.println("Menor de idade");
    }
}
