package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C

        double fator = 5 / 9.0;
        int ajuste = 32;
        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;

        System.out.println("86 fahrenheit resulta em " + celsius + " celsius");

        fahrenheit = 150;
        celsius = (fahrenheit - ajuste) * fator;
        System.out.println("150 fahrenheit resulta em " + celsius + " celsius");


    }
}
