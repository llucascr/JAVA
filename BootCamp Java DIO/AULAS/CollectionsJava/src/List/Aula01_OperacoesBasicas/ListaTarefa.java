package List.Aula01_OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
//        for (Tarefa tarefa : tarefaList) {
//            if (tarefa.getDescricao().equals(descricao)) {
//                tarefasParaRemover.add(tarefa);
//            }
//        }
        tarefaList.forEach(t -> {
            if (t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        });
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return  tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

}
