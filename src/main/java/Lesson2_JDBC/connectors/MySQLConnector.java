package Lesson2_JDBC.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector implements Connector{

    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/web_project?serverTimezone=UTC";

    @Override
    public Connection getConnection() {
        Connection connection;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
