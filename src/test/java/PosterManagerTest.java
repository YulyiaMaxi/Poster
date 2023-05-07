import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PosterManagerTest {
    @Test
    public void test() {
        PosterManager poster = new PosterManager();
        poster.add("Title1");
        poster.add("Title2");
        poster.add("Title3");
        poster.add("Title4");
        poster.add("Title5");
        poster.findAll(); //здесь мы метод не закрываем, тк снизу еще связанный с ним метод, и он тоже относится к этой переменной
        String[] expected = {"Title1", "Title2", "Title3", "Title4", "Title5"};

        String[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        PosterManager poster = new PosterManager();
        poster.add("Title1");
        poster.add("Title2");
        poster.add("Title3");
        poster.add("Title4");
        poster.add("Title5");
        poster.findLast(); //здесь мы метод не закрываем, тк снизу еще связанный с ним метод, и он тоже относится к этой переменной
        String[] expected = {"Title5", "Title4", "Title3", "Title2", "Title1"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        PosterManager poster = new PosterManager(5);
        poster.add("Title1");
        poster.add("Title2");
        poster.add("Title3");
        poster.add("Title4");
        poster.add("Title5");
        poster.add("Title6");
        poster.add("Title7");
        poster.findLast(); //здесь мы метод не закрываем, тк снизу еще связанный с ним  метод, и он тоже относится к этой переменной
        String[] expected = {"Title7", "Title6", "Title5", "Title4", "Title3"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        PosterManager poster = new PosterManager();
        poster.add("Title1");
        poster.add("Title2");
        poster.add("Title3");
        poster.add("Title4");
        poster.add("Title5");
        poster.add("Title6");
        poster.add("Title7");
        poster.findLast(); //здесь мы метод не закрываем, тк снизу еще связанный с ним  метод, и он тоже относится к этой переменной
        String[] expected = {"Title7", "Title6", "Title5", "Title4", "Title3"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test5() {
        PosterManager poster = new PosterManager();
        poster.add("Title1");
        poster.findLast(); //здесь мы метод не закрываем, тк снизу еще связанный с ним  метод, и он тоже относится к этой переменной
        String[] expected = {"Title1"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test6() {
        PosterManager poster = new PosterManager();
        poster.add(null);
        poster.findLast(); //здесь мы метод не закрываем, тк снизу еще связанный с ним  метод, и он тоже относится к этой переменной
        String[] expected = {null};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}

