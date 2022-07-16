package spring.models;

public class Book {
    private int id; //будет инкрементироваться автоматически
    private String title;
    private String author;
    private int year_of_release;

    public Book() {
    }

    public Book(int id, String title, String author, int year_of_release) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year_of_release = year_of_release;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }
}
