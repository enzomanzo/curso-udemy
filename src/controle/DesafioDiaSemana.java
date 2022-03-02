package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        //Domingo -> 1
        //Terca -> 3
        //Quarta -> 4
        //.....
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um dia da semana");
        String dia = sc.next();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("Terca") || dia.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia da semana invalido");
        }


        sc.close();
    }
}
