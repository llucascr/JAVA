public class Main {
    public static void main(String[] args) {
        Data data1 = new Data();


        data1.dia = 12;
        data1.mes = 9;
        data1.ano = 2005;

//        System.out.println(data1.dia+"/"+ data1.mes+"/"+ data1.ano);

        String dataFormatada = data1.dataFormatada();
        System.out.println(dataFormatada);

        Data data2 = new Data();

        data2.dia = 24;
        data2.mes = 3;
        data2.ano = 2005;

//        System.out.println(data2.dia+"/"+ data2.mes+"/"+ data2.ano);

        String dataFormatada2 = data2.dataFormatada();
        System.out.println(dataFormatada2);

        Data dataPadrao = new Data();

        System.out.println("Data Construtor Padrao:");
        String dataPadraoFormatada = dataPadrao.dataFormatada();
        System.out.println(dataPadraoFormatada);

        Data dataComArgs = new Data(4, 3, 1997);
        String dataComArgsFormatada = dataComArgs.dataFormatada();
        System.out.println("Construtor com Args: ");
        System.out.println(dataComArgsFormatada);






    }
}