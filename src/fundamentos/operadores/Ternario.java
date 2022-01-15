package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        //String resuldatoParcial = media > 5 ? "recuperacao" : "reprovado";
        //String resultadoFinal = media >= 7 ? "Aprovado" : media > 5 ? "de recuperacao" : "reprovado"; // simbolo de ? separa os valores que vao ser atribuidos e o simbolo : que separa os valores V ou F

        String resultadoFinal = media >= 7 ? "Aprovado" : "em recuperacao";

        System.out.println("O aluno esta " +resultadoFinal);

        double nota = 9.3;
        boolean bomComportamento = true;
        boolean passouComMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouComMedia;
        String resultado = temDesconto ? "Sim" : "Nao";
        System.out.println("\nTem desconto? " + resultado);

    }
}
