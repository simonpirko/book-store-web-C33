package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private long id;
    private String name;
    private List<Book> books;

    public Category(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
}
