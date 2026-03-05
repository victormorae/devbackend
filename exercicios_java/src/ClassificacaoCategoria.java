public class ClassificacaoCategoria {

    public static void main(String[] args) {

        String produto = "Controle";
        double preco = 300.0;
        String categoria;

        if (preco <= 50.00) {
            categoria = "Econômico";

        } else if (preco > 50.00 && preco <= 200.00) {
            categoria = "Intermediário";
            
        } else {
            categoria = "Premium";

        }

        System.out.println("Categoria do "+ produto+": "+ categoria);

    }

}
