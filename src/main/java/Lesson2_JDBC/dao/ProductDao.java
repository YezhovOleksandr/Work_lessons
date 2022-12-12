package Lesson2_JDBC.dao;

import Lesson2_JDBC.models.Product;
import java.util.*;
import java.sql.SQLException;

public interface ProductDao {
    void save(Product product) throws SQLException;

    void remove(int id) throws SQLException;

    List<Product> getAll() throws SQLException;
}
