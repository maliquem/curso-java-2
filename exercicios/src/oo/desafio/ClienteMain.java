package oo.desafio;

public class ClienteMain {

    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 5.80);
        Produto p2 = new Produto("Caderno", 11.50);
        Produto p3 = new Produto("Estojo", 5.99);

        Compra c1 = new Compra();
        c1.adicionarItem(6, p1);
        c1.adicionarItem(2, p2);
        c1.adicionarItem(1, p3);

        Compra c2 = new Compra();
        c2.adicionarItem(10, p1);
        c2.adicionarItem(6, p2);
        c2.adicionarItem(3, p3);

        Cliente cliente1 = new Cliente("Jael Araripe");
        cliente1.adicionarCompra(c1);
        cliente1.adicionarCompra(c2);

        System.out.println("Valor da compra 1 = " + c1.obterValorTotal());
        System.out.println("Valor da compra 2 = " + c2.obterValorTotal());
        System.out.print("Valor Total = " + cliente1.obterTotal());

    }
}
