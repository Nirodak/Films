package ru.netology.filmconstructor;

public class Afisha {
    private int size;
    private Film[] films = new Film[0];


    public Afisha() {
        this.size = 10;
    }

    public Afisha(int size) {
        this.size = size;

    }

    public void save(Film film) {
        Film[] tmp = new Film[this.films.length + 1];
        for (int i = 0; i < this.films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }


    /**
     * Создаёт фильмы
     * @param name - имя фильма
     * @param gener - Жанр
     * @return - Фильм
     */
    public Film newFilm(String name, String gener) {
        Film film = new Film(name,gener);
        this.save(film);
        return film;

    }


    /**
     * Отображает все фильмы
     * @return - Фильмы
     */
    public Film[] findAll() {
        return films;
    }


    /**
     * @return Возвращает последние фильмы
     */
    public Film[] findLast() {
        int countFilm = this.films.length;
        Film[] films = new Film[this.size];
        int counter = 0;
        if (countFilm < this.size) {
            return this.films;
        }
        for (int i = 0; i < this.size; i++) {
            films[i] = this.films[countFilm - 1 - i];
        }
        return films;

    }
}






