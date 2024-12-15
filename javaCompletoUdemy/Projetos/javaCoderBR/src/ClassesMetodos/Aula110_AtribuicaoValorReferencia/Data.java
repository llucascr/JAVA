package ClassesMetodos.Aula110_AtribuicaoValorReferencia;

public class Data {
    int dia;
    int mes;
    int ano;
//    String nome;

    Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

//    Data (int dia, int mes, int ano, String nome){
//        this(dia, mes, ano);
//        this.nome = nome;
//    }

    String dataFormatada(){
        return this.dia+"/"+ this.mes+"/"+ this.ano;
    }
}

