public class CadastroLivros {

    public static void main(String[] args) {

        String titulo = "2001: Uma Odisseia no Espaço";
        String autor = "Arthur C. Clarke";
        int numeroPaginas = 326;
        double precoLivro = 79.99;
        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";

        } else if (categoria == 'M') {
            categoriaDescricao = "Matemática";

        } else if (categoria == 'T') {
            categoriaDescricao = "Terror";

        } else if (categoria == 'H') {
            categoriaDescricao = "História";

        } else {
            categoriaDescricao = "Categoria inválida";

        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numeroPaginas + " páginas, custa R$" + precoLivro + " e pertence à categoria " + categoriaDescricao + ".");

    }

}
