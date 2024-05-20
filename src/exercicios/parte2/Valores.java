package exercicios.parte2;

public class Valores {

    public static void main(String[] args) {
        double precoProduto = 3.47;
        int qtde = 5;
        double precoProdutoEmDolares = precoProduto /4.94;
        double valorFinal = precoProduto * qtde ;
        double valorFinalEmDolares = precoProdutoEmDolares * qtde;
        double precoOriginal = 17.50;
        double percentualDesconto = 10;
        double valorDesconto = percentualDesconto/100;

        double precoOriginalComDesconto = precoOriginal - (precoOriginal*valorDesconto);


        System.out.println(valorFinal);
        System.out.println(valorFinalEmDolares);
        System.out.println(precoOriginalComDesconto);
    }


}
