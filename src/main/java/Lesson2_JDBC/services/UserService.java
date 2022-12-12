package Lesson2_JDBC.services;

import Lesson2_JDBC.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(int id);

    void save(User user);
}
