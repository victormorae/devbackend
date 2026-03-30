import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        do {
            System.out.println("Digite seu nome:");
            nome = sc.nextLine();

            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");

            }

        } while(nome.length() < 3);

        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
        sc.close();

    }

}