package spring.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import spring.models.Book;
import spring.models.Person;

import java.util.List;

@Component
public class BookDAO {

    private final JdbcTemplate jdbcTemplate;

    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index(){
        return jdbcTemplate.query("SELECT*FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT*FROM book WHERE book_id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO book(title, author, year_of_release, person_id) VALUES (?, ?, ?, ?)", book.getTitle(), book.getAuthor(), book.getYear_of_release(), book.getPerson_id());
    }

    public void update(Book book, int id) {
        jdbcTemplate.update("UPDATE book SET title=?, author=?, year_of_release=?, person_id=? WHERE book_id=?", book.getTitle(), book.getAuthor(), book.getYear_of_release(), book.getPerson_id(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM book WHERE book_id=?",id);
    }
}
