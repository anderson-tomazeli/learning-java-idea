package oo.composicao.oneton.bidirectional;

import oo.composicao.oneton.bidirectional.CompraBidir;

public class ItemBidir {

    String nome;
    int quantidade;
    double preco;
    CompraBidir compraBidir;

    ItemBidir(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
