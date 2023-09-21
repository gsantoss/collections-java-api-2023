package map.operacoesbasicas;

public class TesteOperacoesBasicasMap {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        //Os contatos que possuem as mesma chave (que é o nome) será atualizado sempre que um novo valor for atribuido a esta chave (Camila)
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665); //esse ele não vai adicionar pois o nome é nossa comparação
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 11111111);
        agendaContatos.adicionarContato("Camila", 4444);

        //Exibindo os contatos que foram adicionados ao Map
        System.out.println("Exibindo os contatos que foram adicionados ao Map");
        agendaContatos.exibirContatos();

        //Removendo um contato
        agendaContatos.removerContato("Maria Silva");

        //Exibindo contatos
        System.out.println("Exibindo os contatos após a remoção");
        agendaContatos.exibirContatos();

        //Pesquisando por nome
        System.out.println("O número de contato que você pequisou foi: " + agendaContatos.pesquisarPorNome("Camila DIO"));


    }
}
