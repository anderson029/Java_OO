package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

public class dúvidas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Avatar", 2009);

        Filme adn1 = filme1;
        Filme adn2 = filme1;

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
    }

//No exemplo de código anterior, a saída no console será: "Diferentes".
// Embora os dois objetos tenham as mesmas informações na memória,
// a comparação com == verifica se as referências são iguais, ou seja, se apontam para o mesmo objeto na memória.
