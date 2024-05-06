package br.com.vcsouza.soundMatch;

import br.com.vcsouza.soundMatch.model.Musica;
import br.com.vcsouza.soundMatch.model.Podcasts;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Monster");
        musica.setAlbum("Awake");
        musica.setGenero("Rock");
        musica.setArtista("Skillet");

        for (int i = 0; i < 10000; i++) {
            musica.curtir();
        }
        for (int i = 0; i < 15000; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 15000; i++) {
            int nota = new Random().nextInt(6);
            musica.avaliar(nota);
        }
        System.out.println(musica);


        Podcasts podcast = new Podcasts();
        podcast.setTitulo("credo dos assassinos");
        podcast.setDescricao("podcast para falar sobre uma franquia de jogos assassin's creed");
        podcast.setHost("Vítor");
        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            podcast.curtir();
        }
        for (int i = 0; i < 1000; i++) {
            int nota = new Random().nextInt(6);
            podcast.avaliar(nota);
        }
        System.out.println(podcast);

    }
}