import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        int primeiroLado = sc.nextInt();

        System.out.println("Digite o segundo lado:");
        int segundoLado = sc.nextInt();

        System.out.println("Digite o terceiro lado:");
        int terceiroLado = sc.nextInt();

        if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado && segundoLado + terceiroLado > primeiroLado) {
            System.out.println("Os lados podem formar um triângulo.");

        } else {
            System.out.println("Os lados não podem formar um triângulo.");

        }

        sc.close();

    }

}