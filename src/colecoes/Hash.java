package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme")); //shall have both hashcode and equals generated in the source java class, in this case, Usuario
        System.out.println(resultado);
    }
}
