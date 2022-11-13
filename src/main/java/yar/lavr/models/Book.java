package yar.lavr.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    @Column(name="title")
    private String title;
    @NotEmpty
    @Column(name="author")
    private String author;

    @Column(name="year_of_public")
    private int yearOfPublic;

    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person owner;

    @Column(name="taken_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date takenAt;

    @Transient
    private boolean expired;

    public Book() {}

    public Book( String title, String author, int yearOfPublic) {
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Date getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Date takenAt) {
        this.takenAt = takenAt;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}