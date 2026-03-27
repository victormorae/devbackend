import java.util.Scanner;

public class VerificacaoAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código de acesso:");
        int codigo = sc.nextInt();

        System.out.println("Digite o nível de permissão:");
        int nivelPermissao = sc.nextInt();

        boolean codigoCorreto = codigo == 2023;
        boolean nivelValido = nivelPermissao > 0 && nivelPermissao < 4;

        if (codigoCorreto && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");

        } else {
            System.out.println("Acesso negado.");

        }

        sc.close();

    }

}
