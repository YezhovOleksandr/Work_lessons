package Lesson2_JDBC.services.impl;

import Lesson2_JDBC.dao.UserDao;
import Lesson2_JDBC.models.User;
import Lesson2_JDBC.services.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl  implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        List<User> all = new ArrayList<>();
        try {
            all = userDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public User getById(int id) {
        try {
            Optional<User> byId = userDao.getById(id);
            if (byId.isPresent()) {
                return byId.get();
            } else {
                throw new RuntimeException("User not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(User user) {

    }
}
