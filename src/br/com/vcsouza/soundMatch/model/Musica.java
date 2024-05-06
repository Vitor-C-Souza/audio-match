package br.com.vcsouza.soundMatch.model;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "album='" + album + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                " " + super.toString();
    }
}
