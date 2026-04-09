import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        String sinal = "";
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(sc.next(), formatter);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = sc.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(sc.next(), formatter);

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, saidaReal);

        System.out.println("Horário de entrada: " + entrada.format(formatter) + "\n" +
                "Horário de saída previsto: " + saidaPrevista.format(formatter) + "\n" +
                "Horário real de saída: " + saidaReal.format(formatter));

        if (diferenca.toHours() > 0) {
            sinal = " +";

        } else if (diferenca.toHours() < 0) {
            sinal = " -";

        } else {
            sinal = " ";

        }

        System.out.println("Saldo de horas:" + sinal + diferenca.toHours() + "h " + diferenca.toMinutesPart() + "min");

    }

}