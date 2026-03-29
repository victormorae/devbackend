import java.util.Scanner;

public class EncontrandoMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String[] numerosStr = sc.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);

            if (num > maior) {
                maior = num;

            }

        }

        System.out.println("O maior número é: " + maior);
        sc.close();

    }

}