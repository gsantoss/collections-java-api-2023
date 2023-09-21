package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet = new HashSet<>();

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //adicionar produto:  Adiciona um produto ao cadastro.
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome,cod, preco, quantidade));
    }

    //exibir Produtos Por Nome: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public  Set<Produto> exibirProdutosPorNome(){

        //usamos aqui o TreeSet, pois ele nos permite organizar pelo nome
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //exibir Produtos Por Preco: Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }
}
