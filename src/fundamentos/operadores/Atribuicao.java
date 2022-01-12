package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int d = a + b;

        d += b;       //c = c + b;
        d -= a;       //c = c - b;
        d *= b;       //c = c * b;
        d /= a;       //c = c / a;

        d++;          //c = c + 1;
        System.out.println(d);

        d %= 2;       //c = c % 2; 0 ou 1  COMO DESCOBRIR SE O NUMERO EH PAR OU IMPAR ,0 seria par e 1 impar

        System.out.println(d);
    }
}
