package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        //   int a = 2 + 3 * 4;
        //   int b = (int) Math.pow(a,3);
        //   System.out.println(b);

        // double cima1 = 6 * (3 + 2);
        // double cimatotal1 = Math.pow(cima1, 2);
        // double resultado1 = cimatotal1 / (3 * 2);

        // double cima2 = (1 - 5) * (2 - 7);
        // double divisao2 = cima2 / 2;
        // double resultado2 = Math.pow(divisao2 , 2);

        // double resultadocima = Math.pow(resultado1 - resultado2 , 3);

        // double resultadofinal = resultadocima / Math.pow(10 , 3);


        double numA = Math.pow(6* (3 + 2),2);
        double denA = 3 * 2;

        double numB = (1-5) * (2-7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB , 2);

        double superior = Math.pow(superiorA - superiorB , 3);
        double inferiror = Math.pow(10, 3);

        double resultado = superior / inferiror;

        System.out.println(resultado);
    }
}
