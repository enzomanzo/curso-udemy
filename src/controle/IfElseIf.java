package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota ");
        double nota = sc.nextDouble();

        if (nota >10 || nota <0){
            System.out.println("Nota invalida");
        }else if (nota >= 9.1 ){
            System.out.println("Conceito A");
            System.out.println("Parabens");
        }else if (nota >= 8.1 ){
            System.out.println("Conceito B");
            System.out.println("Quase la");
        }else if (nota >= 6.1){
            System.out.println("Conceito C");
            System.out.println("Na media");
        }else if (nota >= 4.1){
            System.out.println("Conceito D");
            System.out.println("Estude mais");
        }else if (nota >= 3.1){
            System.out.println("Conceito E");
            System.out.println("Continue e vai reprovar");
        }else {
            System.out.println("Conceito F");
            System.out.println("Foque mais nas provas");
        }

        System.out.println("Fim");
        sc.close();
    }
}
