package Lesson2_JDBC.services;

import Lesson2_JDBC.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    void save(Product product);

    void remove(int id);

    List<Product> getAll();
}
