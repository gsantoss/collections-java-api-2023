package list.pesquisa;

public class TestPesquisaList {
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 01","Autor 01", 2020);
        catalagoLivros.adicionarLivro("Livro 01","Autor 02", 2021);
        catalagoLivros.adicionarLivro("Livro 02","Autor 02", 2022);
        catalagoLivros.adicionarLivro("Livro 03","Autor 03", 2023);
        catalagoLivros.adicionarLivro("Livro 04","Autor 04", 1994);

        //Pesquisando por autor:
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 04"));

        //Pesquisando por intervalo de ano
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020,2021));

        //Pesquisando por título (apesar de ter dois lívros com o mesmo título ele vai trazer apenas o 1º que foi inserido,
        // pois a List ordena de acordo com a ordem com que foram inseridos os elementos na list)
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 01"));
    }
}
