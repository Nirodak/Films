import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.filmconstructor.Afisha;
import ru.netology.filmconstructor.Film;

public class TestFilmAfisha {

    @Test
    public void testFindAll() {
        Afisha afisha = new Afisha();
        Film film1 = afisha.newFilm("matrix","boevik");
        Film film2 = afisha.newFilm("matrix","boevik");
        Film film3 = afisha.newFilm("matrix","boevik");
        Film film4 = afisha.newFilm("matrix","boevik");
        Film film5 = afisha.newFilm("matrix","boevik");
        Film film6 = afisha.newFilm("matrix","boevik");


        Film[] expected = {film1, film2, film3, film4, film5, film6};
        Film[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFind20() {
        Afisha afisha = new Afisha(20);
        Film film1 = afisha.newFilm("matrix","boevik");
        Film film2 = afisha.newFilm("matrix","boevik");
        Film film3 = afisha.newFilm("matrix","boevik");
        Film film4 = afisha.newFilm("matrix","boevik");
        Film film5 = afisha.newFilm("matrix","boevik");
        Film film6 = afisha.newFilm("matrix","boevik");
        Film film7 = afisha.newFilm("matrix","boevik");
        Film film8 = afisha.newFilm("matrix","boevik");
        Film film9 = afisha.newFilm("matrix","boevik");
        Film film10 = afisha.newFilm("matrix","boevik");
        Film film11 = afisha.newFilm("matrix","boevik");
        Film film12 = afisha.newFilm("matrix","boevik");
        Film film13 = afisha.newFilm("matrix","boevik");
        Film film14 = afisha.newFilm("matrix","boevik");
        Film film15 = afisha.newFilm("matrix","boevik");

        Film[] expected = {film15, film14, film13, film12, film11, film10, film9, film8,film7,film6,film5,film4,film3,film2,film1};
        Film[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

}
