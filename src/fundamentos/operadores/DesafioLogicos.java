package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //trabalho terca  V ou F
        //trabalho quinta V ou F

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 & trabalho2;
        boolean comprouTv32 = trabalho1^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou tv 50\" ? " + comprouTv50);
        System.out.println("Comprou tv 32\" ? " + comprouTv32);
        System.out.println("Comprou Sorvete ? " + comprouSorvete);
        System.out.println("Mais saudavel ? " + maisSaudavel);
    }
}
