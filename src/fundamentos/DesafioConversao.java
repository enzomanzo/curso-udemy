package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro salario: ");
        String salario1 = sc.next().replace(",", "."); //troca a virgula digitada por ponto ,evitando erro

        System.out.println("Informe o segundo salario: ");
        String salario2 = sc.next().replace(",", "."); //troca a virgula digitada por ponto ,evitando erro

        System.out.println("Informe o terceiro salario: ");
        String salario3 = sc.next().replace(",", "."); //troca a virgula digitada por ponto ,evitando erro

        double nsalario1 = Double.parseDouble(salario1); //transforma a String em Double para realizar a media
        double nsalario2 = Double.parseDouble(salario2); //transforma a String em Double para realizar a media
        double nsalario3 = Double.parseDouble(salario3); //transforma a String em Double para realizar a media

        double media = ((nsalario1 + nsalario2 + nsalario3) / 3);
        System.out.println("a media dos salarios é : " + media);

        sc.close();
    }
}
