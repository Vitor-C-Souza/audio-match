package br.com.vcsouza.soundMatch.model;

public class Podcasts extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Podcasts{" +
                "host='" + getHost() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                " " + super.toString();
    }
}
