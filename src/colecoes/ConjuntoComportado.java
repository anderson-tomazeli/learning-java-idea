package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //create a list with Strings [homogeneous data] - doesn't need to supress warnings
        //Set<String> listaAprovados = new HashSet<>(); //ctrl + shift + o to generate imports
        // <> operador diamond, repete o que foi definido no Set<String>

        //allow sorting by inserting data order
        //<String> - notacao generics - define the type used in the element
        SortedSet<String> listaAprovados = new TreeSet<>(); //ctrl + shift + o to generate imports

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); //only wrapper(object instead of native) types
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
