package controle;


public class SwitchSemBrake {
    public static void main(String[] args) {


        String faixa = "vermelha";

        switch (faixa.toLowerCase()) {
            case "preta":

                System.out.println("Sei o Baasai-Dai...");
            case "marrom":

                System.out.println("Sei o Tekki Shodan...");
            case "roxa":

                System.out.println("Sei o Heidan Godan...");
            case "verde":

                System.out.println("Sei o Heidan Yodan...");
            case "laranja":

                System.out.println("Sei o Heidan Sandan...");
            case "vermelha":

                System.out.println("Sei o Heidan Nidan...");
            case "amarela":

                System.out.println("Sei o Heidan Shodan...");
                break;
            default:
                System.out.println("Nao sei de nada");
        }
        System.out.println("Fim!");

        int idade = 2;
        switch (idade){
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe Falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }
}
