package Lesson2_JDBC.connectors;

import java.sql.Connection;

public interface Connector {
    Connection getConnection();
}
