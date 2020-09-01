package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private long id;
    private Country country;
    private City city;
    private String string;

    public Address(Country country, City city, String string) {
        this.country = country;
        this.city = city;
        this.string = string;
    }
}
