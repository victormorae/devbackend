import java.util.Scanner;

public class ContagemDegraus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");

        int degraus = sc.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau "+ i);
            
        }

        System.out.println("Você chegou ao topo!");
        sc.close();

    }
}