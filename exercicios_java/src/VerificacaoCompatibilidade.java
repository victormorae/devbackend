import java.util.Scanner;

public class VerificacaoCompatibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do doador:");
        int idade = sc.nextInt();

        System.out.println("Digite o peso do doador (em kg):");
        int peso = sc.nextInt();

        if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");

        } else if (peso < 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar mais de 50 kg.");

        } else {
            System.out.println("O doador é compatível.");

        }

    }

}
