import java.util.Scanner;

public class PularNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 10 == 5) {
                continue;
            }

            System.out.println(i + " ");

        }

        sc.close();
        
    }
    
}