package ClassesMetodos.Aula113_This;

public class Data {
    int dia;
    int mes;
    int ano;
    boolean bisexto;

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

    Data (int dia, int mes, int ano, boolean bisexto){
        this(dia, mes, ano);
        this.bisexto = bisexto;
    }

    String dataFormatada(){
        return this.dia+"/"+ this.mes+"/"+ this.ano;
    }
}

