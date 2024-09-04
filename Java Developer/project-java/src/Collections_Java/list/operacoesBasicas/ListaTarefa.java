package Collections_Java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarfea(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removertarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNuemroTotaltarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elemtnso total na lista é : " + listaTarefa.obterNuemroTotaltarefas());

        listaTarefa.adicionarTarfea("Tarefa 1");
        listaTarefa.adicionarTarfea("Tarefa 2");
        listaTarefa.adicionarTarfea("Tarefa 3");
        System.out.println("O numero total de elemtnso total na lista é : " + listaTarefa.obterNuemroTotaltarefas());

        // listaTarefa.removertarefa("Tarefa 1");
        System.out.println("O numero total de elemtnso total na lista é : " + listaTarefa.obterNuemroTotaltarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
