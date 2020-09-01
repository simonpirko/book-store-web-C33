package by.bookstor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private Date date;
    private Role role;

    public User(String firstName, String lastName, String login, String password, Date date, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.date = date;
        this.role = role;
    }
}
