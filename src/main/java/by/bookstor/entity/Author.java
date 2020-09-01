package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private List<Book> books;
    private String description;

    public Author(String firstName, String lastName, int age, List<Book> books, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
        this.description = description;
    }
}
