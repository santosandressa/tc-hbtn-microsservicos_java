package com.song.demo;

import java.util.Objects;

public class Song {

    private Long id;
    private String nome;
    private String artista;
    private String album;
    private String anoLancamento;

    public Song(Long id, String nome, String artista, String album, String anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    public Song(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (!Objects.equals(id, song.id)) return false;
        if (!Objects.equals(nome, song.nome)) return false;
        if (!Objects.equals(artista, song.artista)) return false;
        if (!Objects.equals(album, song.album)) return false;
        return Objects.equals(anoLancamento, song.anoLancamento);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (artista != null ? artista.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (anoLancamento != null ? anoLancamento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }
}
