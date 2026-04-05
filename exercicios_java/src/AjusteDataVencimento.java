import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjusteDataVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);
        LocalDate dataVencimentoNova = dataVencimentoOriginal.plusMonths(1);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataVencimentoNova.format(formatoData);

        System.out.println("Nova data de vencimento: " + dataFormatada);

    }

}