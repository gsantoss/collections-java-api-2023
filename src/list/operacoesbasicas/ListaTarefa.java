package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributos
    private List<Tarefa> tarefaList;

    //Construtor criado para sempre que chamarmos um objeto do tipo ListaTarefa eu já ter uma list vazia para ser
    //adicionados, removidos ou localizados elementos dessa lista quando necessário

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //implementação dos métodos necessários a lógica do negócio

    //adicionar tarefa: Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //remover tarefa: Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }
        }
        //remove todas as tarefas cujo o nome é igual a descrição informada
        tarefaList.removeAll(tarefasParaRemover);
    }

    //obterNumeroTotalTarefas: Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //obterDescricoesTarefas:  Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
}
