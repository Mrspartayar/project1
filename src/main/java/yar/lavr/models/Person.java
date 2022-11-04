package yar.lavr.models;


import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * @author Neil Alishev
 */
public class Person {
    private int id;
   @NotEmpty
    @Min(value = 2, message = "The name must be more than two characters")
    private String name;

    @NotNull
    private int yearOfBirth;

    public Person() {

    }

    public Person(int id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}