package list.operacoesbasicas;

public class Tarefa {

    //atributos
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getters
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
