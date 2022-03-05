package controle;

import java.util.Scanner;

public class ExercicioLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe uma palavra ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        sc.close();
    }
}
