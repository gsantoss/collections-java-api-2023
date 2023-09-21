package map.operacoesbasicas;

import set.pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        //Usamos o contrutor para inciar o objeto já com hashmap, pois é a implementação mais comum usada com Map
        this.agendaContatosMap = new HashMap<>();
    }

    //adicionar Contato: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    //remover Contato: Remove um contato da agenda, dado o nome do contato.
    public  void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    //Exibir Contatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }
    //Pesquisar Por Nome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }
}
