package map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    //Adicionar evento: Adiciona um evento à agenda.
    public  void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    //Exibir agenda: Exibe a agenda de eventos em ordem crescente de data.
    //Como queremos ordenar essa exbição vamos trabalhar com o TreeMap
    //dessa forma ele organizará em ordem crescente
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    //Obter próximo evento: Retorna o próximo evento que ocorrerá.
    public void obterProximoEvento(){

        //O código abaixo não possível utilizar pois não conseguimos relacionar as chaves e valores...
        //pois uma é da interface Set e ou outro é da interface Collection

        /*o método KeySet() nos retorna um Set com todas as chaves
        Set<LocalDate> dateSet = eventoMap.keySet();

        //o método values() nos retorna uma Collection com todos os valores
        Collection<Evento> values = eventoMap.values();*/

        //A melhor maneira de conseguir relacionar essas chaves e valores seria da forma abaixo:

        //retorna a data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);

        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " +  proximoEvento + " contecerá na data: " + proximaData);
                break;
            }
        }
    }
}
