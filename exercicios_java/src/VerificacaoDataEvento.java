import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificacaoDataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataAtualFormatada = dataAtual.format(formatoData);
        String dataEventoFormatada = dataEvento.format(formatoData);

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("Data do evento: " + dataEventoFormatada + "\n" +
                    "Data atual: " + dataAtualFormatada + "\n" +
                    "O evento já ocorreu.");

        } else {
            System.out.println("Data do evento: " + dataEventoFormatada + "\n" +
                    "Data atual: " + dataAtualFormatada + "\n" +
                    "O evento ainda não ocorreu.");

        }

    }

}