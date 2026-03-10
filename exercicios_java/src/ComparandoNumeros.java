import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextInt();

        System.out.println("\nDigite o segundo número:");
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("\nAmbos os números são iguais.");

        } else if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior.");

        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior.");

        }

    }
}