package spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int book_id; //будет инкрементироваться автоматически (PK)

    private int person_id; //FK

    @NotEmpty(message = "title should not be empty")
    @Size(min = 1, max = 100, message = "title should be between 1 and 100 characters")
    private String title;

    @NotEmpty(message = "author should not be empty")
    @Size(min = 1, max = 100, message = "author should be between 1 and 100 characters")
    private String author;

    @Min(value = 1700, message = "year should be greater than 1700")
    private int year_of_release;

    public Book() {
    }

    public Book(int person_id, String title, String author, int year_of_release) {
        this.person_id = person_id;
        this.title = title;
        this.author = author;
        this.year_of_release = year_of_release;
    }

    public int getBook_id() {
        return book_id;
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

    public int getPerson_id() {
        return person_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
