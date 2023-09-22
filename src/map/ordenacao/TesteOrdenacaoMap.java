package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class TesteOrdenacaoMap {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        //Adicionando eventos
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 21),"Evento 01", "Atração 01");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10,22 ),"Evento 02", "Atração 02");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 8,10 ),"Evento 03", "Atração 03");

        //Exivindo eventos em ordem cronológica
        agendaEventos.exibirAgenda();

        //Obter próximo evento
        agendaEventos.obterProximoEvento();


    }
}
