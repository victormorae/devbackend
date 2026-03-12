import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas):");
        String dia = sc.nextLine();

        switch (dia) {
            case "segunda":
                System.out.println("Segunda é um dia útil.");
                break;
            case "terca", "terça":
                System.out.println("Terça é um dia útil.");
                break;
            case "quarta":
                System.out.println("Quarta é um dia útil.");
                break;
            case "quinta":
                System.out.println("Quinta é um dia útil.");
                break;
            case "sexta":
                System.out.println("Sexta é um dia útil.");
                break;
            case "sábado", "sabado":
                System.out.println("Sábado não é um dia útil.");
                break;
            case "domingo":
                System.out.println("Domingo não é um dia útil.");
                break;
            default:
                System.out.println("Você não digitou um dia correto, ou realizou uma entrada incorreta. Tente novamente.");
        }

        sc.close();

    }

}
