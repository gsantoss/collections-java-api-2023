package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    //adicionar contato:  Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    //exibir contatos: Exibe todos os contatos da agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //pesquisar por nome: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public  Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato: contatoSet) {
            if(contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    //atualizar Numero de Contato:Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato: contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
