package oo.desafio;

public class Item {

    int quantidade;
    Produto produto = new Produto();

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
