package yar.lavr.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Book {


    private int id;
   @NotEmpty
   private String title;
    @NotEmpty
   private String author;
    @NotNull
    private int yearOfPublic;

    public Book() {

    }

    public Book(int id, String title, String author, int yearOfPublic) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublic = this.yearOfPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }
}