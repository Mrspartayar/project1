package yar.lavr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import yar.lavr.models.Book;
import yar.lavr.models.Person;


import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM Book WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public Optional<Book> show (String title) {
        return jdbcTemplate.query("SELECT * FROM Book WHERE title=?", new Object[]{title},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny();
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO Book(title, author, year_of_public) VALUES (?,?,?)", book.getTitle(), book.getAuthor(), book.getYearOfPublic());
    }

    public void update(int id, Book updaterBook) {
        jdbcTemplate.update("UPDATE Book SET title=?,author=?, year_of_public=? WHERE id=?", updaterBook.getTitle(), updaterBook.getAuthor(), updaterBook.getYearOfPublic(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM WHERE id=?", id);
    }
}
