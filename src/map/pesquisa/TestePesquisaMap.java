package map.pesquisa;

public class TestePesquisaMap {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        //exibindo produtos no estoque que até o momento está vazio = 0;
        estoqueProduto.exibirProdutos();

        //adicionando produtos no estoque
        estoqueProduto.adicionarProduto(1L, "Produto A", 10,5.0);
        estoqueProduto.adicionarProduto(2L, "Produto B", 5,10.0);
        estoqueProduto.adicionarProduto(3L, "Produto C", 2,15.0);
        estoqueProduto.adicionarProduto(4L, "Produto D", 2,20.0);

        //exibindo produtos após termos inseridos produtos no map
        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque R$ " + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProduto.obterProdutoMaisCaro());
    }
}
