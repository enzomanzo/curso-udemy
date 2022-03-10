package classe;

public class DataTeste {
    public static void main(String[] args) {


        Data d1 = new Data(5,3,2022); //pegou do construtor

        Data d2 = new Data();
        d2.dia = 24;
        d2.mes = 3;
        d2.ano = 1999;

        Data d3 = new Data(); //construtor com data default caso nao seja informado nada

        //String dataformatada1 = d1.obterData();
        //String dataformatada2 = d2.obterData();
        System.out.println();
        System.out.println("Data realizado: " + d1.obterDataFormatada()); //metodo com String.format
        //System.out.println(dataformatada1); //metodo com String.format
        System.out.println();
        System.out.println("Meu aniversario: " + d2.obterDataFormatada()); //metodo com String.format
        System.out.println();
        System.out.println(d3.obterDataFormatada());
        System.out.println();
        d1.imprimirData();  //metodo direto com sysout (nao recomendado)
        d2.imprimirData();  //metodo direto com sysout (nao recomendado)

    }
}
