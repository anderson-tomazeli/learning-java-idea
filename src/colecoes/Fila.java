package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();

        //fila.add("Ana");
        //fila.add("Bia");
        //fila.add("Carlos");
        //fila.add("Daniel");
        //fila.add("Rafaela");
        //fila.add("Gui");

        for (int i = 1; i < 11; i++) {
            fila.add(Integer.toString(i));
        }

        System.out.println("Current size: " + fila.size());
        System.out.println("Picking #" + fila.poll());
        System.out.println("Current size: " + fila.size());
        System.out.println("Picking #" + fila.poll());
        System.out.println("Current size: " + fila.size());

    }

}
