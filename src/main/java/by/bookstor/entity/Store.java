package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private long id;
    private List<Book> books;
    private Address address;
    private List<Order> orders;
    private PayMethod payMethod;
    private List<Phone>  phones;
    private List<User> users;

    public Store(List<Book> books, Address address, List<Order> orders, PayMethod payMethod, List<Phone> phones, List<User> users) {
        this.books = books;
        this.address = address;
        this.orders = orders;
        this.payMethod = payMethod;
        this.phones = phones;
        this.users = users;
    }
}
