package controle;

import java.util.Scanner;

public class ValorMenor {
    public static void main(String[] args) {

        int valor;
        int menor = Integer.MAX_VALUE;
        int contador = 1;

        Scanner sc = new Scanner (System.in);

        while (contador<=5){
            System.out.println("Informe o "+contador+" numero");
            valor = sc.nextInt();
            if (valor < menor) {
                menor = valor;
            }

            contador++;
        }

        System.out.println(menor);
    }
}
