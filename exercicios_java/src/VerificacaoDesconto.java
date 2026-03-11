import java.util.Scanner;

public class VerificacaoDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra:");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado." +
                    "Valor total: " + valorComDesconto);

        } else {
            System.out.println("Nenhum desconto aplicado." +
                    "Valor total: " + valorCompra);

        }

        sc.close();

    }

}