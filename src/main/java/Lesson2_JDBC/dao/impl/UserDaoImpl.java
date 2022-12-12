package Lesson2_JDBC.dao.impl;

import Lesson2_JDBC.connectors.MySQLConnector;
import Lesson2_JDBC.dao.UserDao;
import Lesson2_JDBC.mappers.UserMapper;
import Lesson2_JDBC.models.User;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    private final Connection connection;
    public UserDaoImpl() {
        connection = new MySQLConnector().getConnection();
    }

    @Override
    public Optional<User> getById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from user WHERE id = ?");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        List<User> users = UserMapper.mapUsersFromResultSet(resultSet);
        User user = null;
        if (users.size() != 0) {
           user = users.get(0);
        }
        statement.close();
        return Optional.ofNullable(user);
    }

    @Override
    public List<User> getAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        List<User> users = UserMapper.mapUsersFromResultSet(resultSet);
        statement.close();
        return users;

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
