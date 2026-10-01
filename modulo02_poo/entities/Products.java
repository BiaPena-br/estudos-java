package modulo02_poo.entities;

public class Products {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalNoEstoque() {
        return preco * quantidade;
    }
    public void entradaNoEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    public void saidaNoEstoque(int quantidade) {
        this.quantidade -= quantidade; //this fala que está se referindo ao atributo quantidade da classe, e não ao parâmetro quantidade do método.
    }
    public String toString() {
        return nome 
        + ", $ "
        + String.format("%.2f", preco)
        + ", "
        + quantidade
        + " unidades, Total: $ "
        + String.format("%.2f", valorTotalNoEstoque());
    }
}