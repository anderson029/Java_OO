package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);
        var filmeDoAnderson = new Filme("ToyStory", 1995);
        filmeDoAnderson.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoAnderson);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

/* (outra forma de fazer foreach,utilizando o recurso conhecido como Method Reference, que nada mais é do que uma forma reduzida de uma expressão lambda)
lista.forEach(System.out::println);*/

        for (Titulo item: lista) {
            System.out.println(item.getNome());

// a partir do java 17 pode fazer dessa forma: if (item instanceof Filme filme && filme.getClassificacao > 2)
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Tom Hanks");
        buscaPorArtista.add("Jim Carrey");
        buscaPorArtista.add("Adam Sandler");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Depois da ordenação:" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: " + lista);
    }
}
