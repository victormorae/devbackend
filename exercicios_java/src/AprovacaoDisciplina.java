import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média final do estudante abaixo:");
        double mediaFinal = sc.nextDouble();

        if (mediaFinal >= 7.0 && mediaFinal <= 10.0) {
            System.out.println("O estudante teve média " + mediaFinal + " e foi aprovado.");

        } else if (mediaFinal >= 5.0 && mediaFinal <= 10.0) {
            System.out.println("O estudante teve média " + mediaFinal + " e está de recuperação.");
            
        } else if (mediaFinal < 0.0 || mediaFinal > 10.0) {
            System.out.println("Média inválida, tente novamente.");

        } else {
            System.out.println("O estudante teve média " + mediaFinal + " e foi reprovado. ");

        }

    }
}
