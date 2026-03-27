import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = sc.nextDouble();

        if (valorEmprestimo >= 1000.0 && valorEmprestimo <= 5000.0) {
            System.out.println("O valor " + valorEmprestimo + ", está dentro do intervalo permitido do empréstimo.");

        } else {

            System.out.println("O valor " + valorEmprestimo + ", não está dentro do intervalo permitido do empréstimo.");
        }


        sc.close();

    }

}