package oo.composicao.oneton.bidirectional;

import oo.composicao.oneton.bidirectional.ItemBidir;

import java.util.ArrayList;

public class CompraBidir {

    String cliente;
    //Homogeneous list (accept only Item type)
    //Relation 1 to N - Uma compra tem vários itens, 1 Item tem uma compra
    ArrayList<ItemBidir> itens = new ArrayList<ItemBidir>();

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new ItemBidir(nome, quantidade, preco));
    }

    void adicionarItem(ItemBidir item) {
        this.itens.add(item);
        item.compraBidir = this;
    }

    double obterValorTotal(){
        double total = 0;

        for (ItemBidir itemBidir : itens) {
            total += itemBidir.quantidade * itemBidir.preco;
        }
        return total;
    }
}
