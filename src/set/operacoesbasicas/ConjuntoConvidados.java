package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //adicionar Convidado:  Adiciona um convidado ao conjunto.
    public  void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //remover Convidado Por Codigo do Convite: Remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado: convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //contar Convidados: Conta o número total de convidados no Set.
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //exibir Convidados: Exibe todos os convidados do conjunto.
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
