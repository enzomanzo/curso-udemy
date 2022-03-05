package controle;

import java.util.Scanner;

public class ValorMaior {
    public static void main(String[] args) {

        int contador = 0;
        int valor;
        int maior= Integer.MIN_VALUE;

        Scanner sc = new Scanner (System.in);


        while (contador <=10){
            System.out.println("Informe o "+(contador+1)+" numero");
            valor = sc.nextInt();
            if(valor>maior)
            maior = valor;

            contador++;
        }
        System.out.println(maior);
    }
}
