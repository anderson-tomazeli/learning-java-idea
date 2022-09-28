package oo.composicao.oneton.bidirectional;

public class CompraTesteBidir {

    public static void main(String[] args) {
        CompraBidir compraBidir1 = new CompraBidir();
        compraBidir1.cliente = "João Pedro";

        compraBidir1.adicionarItem("Caneta", 20, 7.45);
        compraBidir1.adicionarItem(new ItemBidir("Borracha", 12, 3.89));
        compraBidir1.adicionarItem(new ItemBidir("Caderno", 3, 18.79));

        System.out.println("Qtde de Itens  : " + compraBidir1.itens.size());
        System.out.println("Total da Compra: " + compraBidir1.obterValorTotal());

        // Só pra mostrar a relação bidirecional!!!
        double total = compraBidir1.itens.get(0).compraBidir
                .itens.get(1).compraBidir.obterValorTotal();
        System.out.println("O total é R$: " + total);
    }
}
