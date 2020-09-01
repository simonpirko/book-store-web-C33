package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private String name;
    private Author author;
    private int year;
    private int quantityPage;
    private List<Category> categoryList;
    private BigDecimal price;

    public Book(String name, Author author, int year, int quantityPage, List<Category> categoryList, BigDecimal price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.quantityPage = quantityPage;
        this.categoryList = categoryList;
        this.price = price;
    }
}
