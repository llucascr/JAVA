package List.Aula01_OperacoesBasicas;

public class Main {

    public static void main(String[] args) {

        // 1. Lista de Tarefas
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Fazer aula BootCamp java DIO"); // adiciona
        listaTarefa.adicionarTarefa("Estudar para prova de Java");
        listaTarefa.adicionarTarefa("Ir ao Medico");

        System.out.println("Contador: " + listaTarefa.obterNumeroTotalTarefas()); // contador

        listaTarefa.removerTarefa("Ir ao Medico"); // remove

        System.out.println("Contador: " + listaTarefa.obterNumeroTotalTarefas()); // contador

        listaTarefa.obterDescricoesTarefas(); // imprime

    }
}
