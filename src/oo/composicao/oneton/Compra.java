package oo.composicao.oneton;

import java.util.ArrayList;

public class Compra {

    String cliente;
    //Homogeneous list (accept only Item type)
    //Relation 1 to N - Uma compra tem vários itens, 1 Item tem uma compra
    ArrayList<Item> itens = new ArrayList<Item>();

    double obterValorTotal(){
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
