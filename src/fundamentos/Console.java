package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {


        int a = 3;

        System.out.print("Bom");
        System.out.print(" Dia\n");

        System.out.println("Boa");
        System.out.println("Tarde");
        System.out.printf("Megasena: %d %d %d %d %n", 1, 2, 3, 4); //%d inteiro / %s string / %n quebra linha

        System.out.printf("Salario : %.1f %n", 1234.5678);
        System.out.printf("Nome : %s %n", "Joao");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome : ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu Sobrenome : ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt();

        System.out.printf("%s %s tem %d Anos" , nome,sobrenome,idade);

        sc.close();
    }
}
