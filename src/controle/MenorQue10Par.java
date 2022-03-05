package controle;

import java.util.Scanner;

public class MenorQue10Par {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um numero ");
        int numero = sc.nextInt();

        if (numero <=10 && numero>=0 && numero % 2==0) {
            System.out.println("Numero "+numero+ " é par e esta entre 0 e 10");
        }else if (numero % 2 == 0){
            System.out.println("Numero "+numero+ " é par mas nao esta entre 0 e 10");
        }else if (numero % 2==1 &&  numero > 10 || numero < 0){
            System.out.println("Numero "+numero+ " é impar mas nao esta entre 0 e 10");
        }else{
            System.out.println("Numero eh impar e esta entre 0 e 10");
        }

        sc.close();
    }
}
