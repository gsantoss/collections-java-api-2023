package list.ordenacao;

public class TesteOrdenacaoList {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //adiconando elementos em nossa lista
        ordenacaoPessoas.adicionarPessoa("Nome 01", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 02", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 03", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 04", 17, 1.56);

        //exibindo a lista tal conforme foi inserida inicialmente
        System.out.println("Exibindo a lista sem ordená-la");
        System.out.println(ordenacaoPessoas.getPessoaList());

        //ordenando por idade
        System.out.println("Ordenando por idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        //ordenando por altura
        System.out.println("Ordenando por altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
