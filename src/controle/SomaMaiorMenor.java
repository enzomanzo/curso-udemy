package controle;

import java.util.Scanner;

public class SomaMaiorMenor {
    public static void main(String[] args) {

        int valor;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int contador = 1;


        Scanner sc = new Scanner(System.in);

        while (contador <= 5) {
            System.out.println("Informe o " + contador + " numero");
            valor = sc.nextInt();
            if (valor > maior)
                maior = valor;
            if (valor < menor)
                menor = valor;


            contador++;
        }

        System.out.println("Soma do maior : " + maior + " com o menor: " + menor + " = " + (maior + menor));

    }
}
