package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    //adicionar livro: Adiciona um livro ao catálogo.
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //pesquisar por autor:  Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro: livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    //pesquisar por intervalo de anos: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntevaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro: livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntevaloAnos.add(livro);
                }
            }
        }

        return livrosPorIntevaloAnos;
    }

    //pesquisar por titulos: Pesquisa livros por título e retorna o primeiro livro encontrado
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo =  null;
        for (Livro livro: livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
    }
}
