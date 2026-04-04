import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculoDataEntrega {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2025, 3, 15);
        LocalDate dataEntrega = dataInicio.plusDays(15);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatoData);

        System.out.println("Data de entrega: " + dataFormatada);

    }

}