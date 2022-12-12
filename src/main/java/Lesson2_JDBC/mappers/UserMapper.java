package Lesson2_JDBC.mappers;

import Lesson2_JDBC.models.User;

import java.sql.SQLException;
import java.util.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.List;

public class UserMapper {
    public static List<User> mapUsersFromResultSet(ResultSet resultSet) throws SQLException {
        List<User> users = new ArrayList<>();

        while (resultSet.next()) {
            User user = new User(resultSet.getInt(1),
                    resultSet.getString(2), resultSet.getString(3),
                    resultSet.getString(4),resultSet.getString(5));
            users.add(user);
        }
        return users;
    }


}
