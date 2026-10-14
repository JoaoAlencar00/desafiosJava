public class Desafios {
    public static void main(String[] args) {

        double notas = (9.4 + 6.3);
        int media = (int) (notas /2);
        System.out.println("A media das notas é " + media);

        double x = 10.5;
        int y = (int) x;
        System.out.println(y);

        char letra_J = 74;
        String palavra ="oão Paulo";
        System.out.println(letra_J + palavra);

        double precoProduto = 10.57;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é " + valorTotal);

        double valorEmDolares = 25.50;
        double valoreEmReais = (valorEmDolares * 4.94);

        String mensagem = """
                Voce tem %.2f dolares.
                Em reais voce tem %.2f reais
                """.formatted(valorEmDolares, valoreEmReais);
        System.out.println(mensagem);

        double precoOriginal = 100.00;
        double percentualDesconto = 20;

        double descontoAplicado = (precoOriginal * percentualDesconto) /100;
        double precoComDesconto = precoOriginal - descontoAplicado;

        System.out.printf("O preço original era R$%.2f.%n", precoOriginal);
        System.out.printf("O desconto aplicado foi de %.2f%% (R$%.2f).%n", percentualDesconto, descontoAplicado);
        System.out.printf("O preço com desconto é R$%.2f.%n", precoComDesconto);








    }
}
