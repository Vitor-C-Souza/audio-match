package br.com.vcsouza.soundMatch.model;

public class Audio {
    private String titulo;
    private int avaliacao;
    private int QtAvaliacao;
    private int totalReproducoes;
    private int totalCurtidas;

    public void curtir() {
        totalCurtidas++;
    }

    public void reproduzir() {
        totalReproducoes++;
    }

    public void avaliar(int nota) {
        QtAvaliacao++;
        avaliacao += nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao / this.QtAvaliacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    @Override
    public String toString() {
        return "titulo='" + getTitulo() + '\'' +
                ", avaliacao=" + getAvaliacao() +
                ", Reproducoes=" + getTotalReproducoes() +
                ", Curtidas=" + getTotalCurtidas() +
                '}';
    }
}
