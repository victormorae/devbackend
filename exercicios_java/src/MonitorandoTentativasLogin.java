import java.util.Scanner;

public class MonitorandoTentativasLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int senha;
        int tentativasRestantes = 3;

        do {
            System.out.println("Digite a sua senha: ");
            senha = sc.nextInt();

            if (senha != 1234) {
                tentativas++;
                tentativasRestantes--;
                System.out.println("Senha incorreta! Você tem "+ tentativasRestantes + " tentativas restantes.\n");

                if (tentativas == 3) {
                    System.out.println("Conta bloqueada temporariamente.");
                    break;
                }


            } else {
                System.out.println("Senha Correta! Acesso concedido.");
                break;

            }

        } while(tentativas < 4);

        sc.close();

    }

}