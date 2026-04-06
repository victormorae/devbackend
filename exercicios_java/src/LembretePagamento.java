import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate vencimentoConta = LocalDate.of(2025, 3, 30);
        LocalDate dataLembrete = vencimentoConta.minusDays(5);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formatoData);

        System.out.println("Data do lembrete: " + dataFormatada);


    }

}