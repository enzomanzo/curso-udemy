package classe;


public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",4.600,0.25);
        // p1.nome = "Notebook";
        //p1.preco = 4600;
        //p1.desconto = 0.25;


        var p2 = new Produto();
        p2.nome = "caneta preta";
        p2.preco = 15;
        p2.desconto = 0.20;

        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.desconto);
        System.out.println();
        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);
        System.out.println();

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.5);
        double valorCarrinho = (precoFinal1 + precoFinal2);

        System.out.println("O produto " + p1.nome + " tem como preco final " + precoFinal1);
        System.out.println("O produto " + p2.nome + " tem como preco final " + precoFinal2);
        System.out.println();
        System.out.println("****** O valor do seu carrinho eh de: R$" + valorCarrinho + " ******");
    }
}
