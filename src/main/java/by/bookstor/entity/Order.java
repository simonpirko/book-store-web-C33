package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private long id;
    private Type type;
    private Status status;
    private User user;
    private Address address;
    private BigDecimal price;
    private List<Book> books;

    public Order(Type type, Status status, User user, Address address, BigDecimal price, List<Book> books) {
        this.type = type;
        this.status = status;
        this.user = user;
        this.address = address;
        this.price = price;
        this.books = books;
    }
}
