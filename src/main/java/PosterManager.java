public class PosterManager { // пишем класс менеджер
    String[] titles = new String[0]; //заводим массив с длиной 0
    private int limit;

    PosterManager() { //создаем пустой конструктор, который по умолчанию принимает значение 5 при выводе фильмов

        this.limit = 5;
    }

    PosterManager(int limit) { //cоздаем конструктор с параметром лимита фильмов

        this.limit = limit;
    }

    public void add(String title) { // пишем метод, который сохраняет фильмы в массив
        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) { // здесь пробежимся по длине массива titles
            tmp[i] = titles[i];
        }                                    // здесь обязательно скобка, тк старый массив переложили в новый
        tmp[tmp.length - 1] = title;
        this.titles = tmp;

    }

    public String[] findAll() {// пишем метод, который вывод в порядке добавления фильмы
        return titles;
    }

    public String[] findLast() { // пишем метод, который выводит фильмы начиная с последнего, кол.-во зададаем limit
        int resultLength;
        if (titles.length < limit) {
            resultLength = titles.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) { //здесь пробежимся по длине массива tmp
            tmp[i] = titles[titles.length - 1 - i];
        }

        return tmp;

    }


}



