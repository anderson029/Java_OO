package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

import java.security.PublicKey;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    /*Contrutores são criados para ter uma obrigatoriedade no método, construtores não são herdados.
    * é preciso utlizar o super dentro do construtor para chamar a classe "pai".
    *  */
    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "("+ getAnoDeLancamento() + ")";
    }
}
