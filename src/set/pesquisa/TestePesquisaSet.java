package set.pesquisa;

public class TestePesquisaSet {
    public static void main(String[] args) {

        //instaciamos um objeto
        AgendaContato agendaContato = new AgendaContato();

        //Exibimos os contatos no set que até o momento está vazio
        agendaContato.exibirContatos();

        //Esse contatos serão inseridos em ordem aleatória e não na ordem que o inserimos
        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 0); //esse ele não vai adicionar pois o nome é nossa comparação
        agendaContato.adicionarContato("Camila Cavalcante", 11111111);
        agendaContato.adicionarContato("Camila DIO", 654987);
        agendaContato.adicionarContato("Maria Silva", 11111111);

        //Exibimos os contatos no set que agora possui todos os contatos acima
        agendaContato.exibirContatos();

        //Pesquisando por nome
        System.out.println(agendaContato.pesquisarPorNome("Maria"));

        //Atualizando contato
        System.out.println("Contato Atualizado: " + agendaContato.atualizarNumeroContato("Maria Silva", 88888888));

        //exibindo os contatos após a atualização de contato
        agendaContato.exibirContatos();
    }
}
