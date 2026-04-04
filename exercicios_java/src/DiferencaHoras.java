import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHoras {
    public static void main(String[] args) {
        LocalTime primeiroHorario = LocalTime.of(14, 30, 0);
        LocalTime segundoHorario = LocalTime.of(16, 45, 0);

        Duration diferenca = Duration.between(primeiroHorario, segundoHorario);
        int horas = diferenca.toHoursPart();
        int minutos = diferenca.toMinutesPart();

        System.out.println("Diferença de tempo: " + horas + " horas e " + minutos + " minutos.");

    }

}