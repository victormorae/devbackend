import java.util.Scanner;

public class ParImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, eu posso te dizer se o número que digitar abaixo é par ou ímpar.");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");

        } else {
            System.out.println("O número " + numero + " é ímpar.");

        }

        sc.close();

    }

}
