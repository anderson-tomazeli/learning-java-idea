package oo.composicao.nton;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome; //constante
    final List<Curso> cursos = new ArrayList<>(); //lista constante = não é permitido criar um novo objeto e apontar para esta variável (constante) mas pode alterar o conteúdo(add, excluir, alterar)

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this); //relação bidirecional
    }

    Curso obterCursoPorNome(String nome){
        for(Curso curso: this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }

    public String toString(){ //Usado para converter o objeto para o formato String
        return nome;
    }
}
