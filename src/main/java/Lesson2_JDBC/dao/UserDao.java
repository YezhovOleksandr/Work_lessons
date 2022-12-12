package Lesson2_JDBC.dao;

import Lesson2_JDBC.models.User;

import java.sql.SQLException;
import java.util.*;
public interface UserDao {
    Optional<User> getById(int id) throws SQLException;
    List<User> getAll() throws SQLException;
    void save(User user);
    void remove(int id);
}
