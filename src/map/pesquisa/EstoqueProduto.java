package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    Map<Long, Produto> estoqueProdutoMap;

    //Criamos um construtor onde iniciamos nosso objeto com um Hashmap vazio
    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    //adicionar produto: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome,preco, quantidade));
    }

    // Exibir produtos: Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    //Calcular valor total em estoque: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            //Criamos um laço iterando sobre o Map de produtos para verificar e pegamos o value() - que são os produtos
            for (Produto produto: estoqueProdutoMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //Obter produto mais caro: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        //Quando queremos pegar um menor valor de um double, geralmente utilizamos o MIN_VALUE, pois quando o laço de
        //repetição começar, 0 1º produto independente do valor dele, já será o maior preço e em seguida vamos comparando
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            //como queremos somente os valores, ignoramos as "keys"
            for (Produto produto: estoqueProdutoMap.values()) {
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }
}
