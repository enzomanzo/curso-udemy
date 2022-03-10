package classe;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        //fazer pessoa comer a comida e mostrar peso antes e depois de comer

        String nomePessoa;
        String nomeComida;
        double pesoComida;
        double pesoPessoa;

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o nome da comida");
        nomeComida = sc.nextLine();

        System.out.println("Informe o peso da comida");
        pesoComida = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe o nome da Pessoa");
        nomePessoa = sc.nextLine();

        System.out.println("Informe o peso da pessoa");
        pesoPessoa = sc.nextDouble();

        System.out.println("Comida "+nomeComida+" Peso: "+pesoComida);
        System.out.println("Cliente "+nomePessoa+" Peso: "+pesoPessoa);


        Comida c1 = new Comida(pesoComida,nomeComida);
        Pessoa p1 = new Pessoa(pesoPessoa,nomePessoa);
        System.out.println("Peso " + p1.getNome() + " " + p1.getPeso());
        p1.comer(c1);
        System.out.println("Peso "+p1.getNome()+ " depois de comer " +p1.getPeso());


        sc.close();
    }
}
