package ru.netology.filmconstructor;

public class Film {
    private int idFilms;
    private String name;
    private String genres;

    private static int count = 0;

    public Film(String name, String genres) {
        this.name = name;
        this.genres = genres;
        count++;
        this.idFilms = count;

    }


    public int getId() {
        return idFilms;
    }

    public void setId(int idFilms) {
        this.idFilms = idFilms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;

    }

    public void setGenres(String genres) {
        this.genres = genres;
    }


}

