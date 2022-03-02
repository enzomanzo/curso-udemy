package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = sc.nextDouble();
        if (media >= 7.0){
            System.out.println("Parabens voce passou de ano");
        }else{
            System.out.println("Infelizmente esta de recuperacao");
        }

        sc.close();
    }
}
