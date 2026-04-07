import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoFusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horarioLocal = ZonedDateTime.now();
        ZonedDateTime horarioSidney = horarioLocal.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + horarioLocal.format(formatter) + "\n" +
                "Horário atual em Sydney: " + horarioSidney.format(formatter));

    }

}