package ru.netology.repository;

public class Films {
    private int idFilms;
    private String name;
    private String genres;

    public void Film(int idFilms, String name, String genres) {
        this.idFilms = idFilms;
        this.name = name;
        this.genres = genres;

    }

    public int getId() {
        return idFilms;
    }

    public int setId(int idFilms) {
        this.idFilms = idFilms;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;

    }

    public String setGenres(String genres) {
        this.genres = genres;
    }
}
