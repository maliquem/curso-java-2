package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterTotal(){
        double total = 0.0;
        for (Compra compra: compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
