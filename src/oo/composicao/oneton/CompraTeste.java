package oo.composicao.oneton;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.itens.add(new Item("Caneta", 20, 7.45));
        compra1.itens.add(new Item("Borracha", 12, 3.89));
        compra1.itens.add(new Item("Caderno", 3, 18.79));

        System.out.println("Qtde de Itens  : " + compra1.itens.size());
        System.out.println("Total da Compra: " + compra1.obterValorTotal());

    }
}
