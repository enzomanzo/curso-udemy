package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        //tipos numericos inteiros
        byte anosEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 10_134_845_223L; // _ utilizado para encurtar o tamanho do numero; L utilizado para monstrar que seria um numero Long

        //tipos numericos reais
        float salario = 11_445.44F;  //F utilizado para indicar ao java que o numero seria um float
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo boolean
        boolean estaDeFerias = false; // true

        //tipo caractere
        char status = 'A'; //Ativo

        //dias de empresa
        System.out.println(anosEmpresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha " + salario);

        System.out.println("Ferias ? " + estaDeFerias);

        System.out.println("Status: " + status);
    }
}
