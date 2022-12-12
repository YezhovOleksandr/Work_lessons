package Lesson2_JDBC.mappers;

import Lesson2_JDBC.models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static List<Product> mapProductsFromResultSet(ResultSet resultSet) throws SQLException {
        List<Product> products = new ArrayList<>();

        while (resultSet.next()) {
            Product product = new Product(resultSet.getInt(1),resultSet.getString(2
            ), resultSet.getString(3), resultSet.getDouble(4));
            products.add(product);
        }
        return products;
    }
}
