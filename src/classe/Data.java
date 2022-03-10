package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    // metodo mais aconselhavel pois tem compatilidade com varias aplicacoes
    String obterDataFormatada() {
        String formato = "%d/%d/%d";
        return String.format(formato,dia,mes,ano);
    }
    //metodo nao retorna em diversas aplicacoes por isso nao recomendado
    void imprimirData(){
        System.out.println(obterDataFormatada());
    }


    Data (){
       /* dia = 1;
        mes = 1;
        ano = 1970;*/
        this(1,1,1970);
    }

    Data(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
