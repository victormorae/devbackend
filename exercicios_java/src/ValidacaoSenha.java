import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, usuário. Digite a senha:");
        int senha = sc.nextInt();

        if (senha == 123456) {
            System.out.println("Acesso permitido!");

        } else {
            System.out.println("Acesso negado!");

        }

    }

}
