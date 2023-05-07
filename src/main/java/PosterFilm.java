public class PosterFilm {
    private String title;
    private int id;
    private int yearRelease;

    public PosterFilm(int id, String title, int yearRelease) {
        this.id = id;
        this.title = title;
        this.yearRelease = yearRelease;
    }

    public String getTitle() {
        return title;
    }
}
