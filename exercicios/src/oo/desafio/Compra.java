package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(int quantidade, Produto produto){
        this.itens.add(new Item(quantidade, produto));
    }
    void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(quantidade, new Produto(nome, preco)));
    }

    double obterValorTotal(){
        double total = 0.0;
        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
