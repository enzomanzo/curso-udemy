package fundamentos;


public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(0));

        String s = "Boa Tarde";
        System.out.println(s.concat(" !!!"));
        System.out.println(s + " !!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("Tarde"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("Boa Tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1234.455;

        System.out.println("\n" + nome + " " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario);

    }
}
