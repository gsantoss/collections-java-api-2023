package list.operacoesbasicas;

public class TesteOperacoesBasicasList {
    public static void main(String[] args) {

        //Objeto criado e instanciado com uma lista vazia
        ListaTarefa listaTarefa = new ListaTarefa();

        //O código abaixo imprime o total de elementos da nossa lista que até aqui está vazia = 0;
        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //adic System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());ionando elementos na lista
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");
        listaTarefa.adicionarTarefa("Tarefa 03");
        listaTarefa.adicionarTarefa("Tarefa 04");
        listaTarefa.adicionarTarefa("Tarefa 01");

        //Agora nossa lista terá um total de 05 elementos
        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Removendo uma tarefa
        listaTarefa.removerTarefa("Tarefa 01");

        //Exibindo o total de elementos após a remoção do elemento acima no método removerTarefa()
        System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Obtendo as descrições das tarefas
        listaTarefa.obterDescricoesTarefas();
    }
}
