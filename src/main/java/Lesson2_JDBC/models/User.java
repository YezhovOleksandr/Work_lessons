package Lesson2_JDBC.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
}
