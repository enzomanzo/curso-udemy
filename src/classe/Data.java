package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    // metodo mais aconselhavel pois tem compatilidade com varias aplicacoes
    String obterData() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    //metodo nao retorna em diversas aplicacoes por isso nao recomendado
    void imprimirData(){
        System.out.println(obterData());
    }


    Data (){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial,int mesInicial, int anoIncial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoIncial;
    }
}
