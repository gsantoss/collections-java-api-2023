package set.operacoesbasicas;

public class TesteOperacoesBasicasSet {
    public static void main(String[] args) {

        //intaciamos um novo objeto
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //exibimos na tela a quantidade de convidade que existem até aqui no conjunto (Total = 0)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        //Adicionando convidados no Set de convidados
        conjuntoConvidados.adicionarConvidado("Convidado 01", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 02", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 03", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 04", 1236);

        //Exibindo os convidados inseridos no conjunto
        conjuntoConvidados.exibirConvidados();

        //Exibindo a quantidade de convidados dentro do Set de Convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        //Removendo um convidado
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        conjuntoConvidados.exibirConvidados();

        //exibimos na tela a quantidade de convidade que existem até aqui no conjunto (Total = 0)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

    }
}
