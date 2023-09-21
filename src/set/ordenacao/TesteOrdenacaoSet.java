package set.ordenacao;

public class TesteOrdenacaoSet {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //Exibindo o Set de Produtos que até o momento está vazio
        System.out.println(cadastroProdutos.getProdutoSet());

        //No trecho abaixo o produto  3 que possui o mesmo código do produto 1 não será inserido no Set de Produtos
        //pois o código que é nosso atributo de comparação e validação de um objeto já foi utilizado pelo produto 1.
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        //Exibindo o Set de Produtos com os produtos que foram adicionados acima
        System.out.println(cadastroProdutos.getProdutoSet());

        //Exibindo produto por nome
        System.out.println("Exibindo produtos por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        //Exibindo produto por preco
        System.out.println("Exibindo produtos por preco:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
