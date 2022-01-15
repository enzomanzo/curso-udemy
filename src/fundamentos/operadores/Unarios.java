package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...V ou F?");
        System.out.println(++a == b--); // neste exemplo o "++" antes da variavel é executado e em sequencia é feito a comparacao com o b (++a == b)
        System.out.println(++a == --b); // neste exemplo o "++" antes da variavel a é executado , em sequencia é executado o "--" antes da variavel b e por fim a comparacao(++a == --b)
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
