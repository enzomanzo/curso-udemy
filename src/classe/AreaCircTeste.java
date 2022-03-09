package classe;

public class AreaCircTeste {
    public static void main(String[] args) {


        AreaCirc a1 = new AreaCirc(10);
        //a1.pi = 10;
        System.out.println(a1.area());

        //AreaCirc.PI = 3.1415;
        System.out.println(AreaCirc.area(100));
        System.out.println(AreaCirc.PI);

    }


}

