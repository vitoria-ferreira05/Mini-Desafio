package Model;

public class Produto {
    private int codigoProduto;
    static int contCodigoProduto = 0;

    private String nomeProduto;
    private double preco;

    public Produto(int codigo, String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        Produto.contCodigoProduto++;
        this.codigoProduto = contCodigoProduto;

    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }
}
