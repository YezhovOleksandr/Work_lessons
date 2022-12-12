package Lesson2_JDBC.dao.impl;

import Lesson2_JDBC.connectors.MySQLConnector;
import Lesson2_JDBC.dao.ProductDao;
import Lesson2_JDBC.mappers.ProductMapper;
import Lesson2_JDBC.models.Product;

import java.sql.*;
import java.util.List;

public class ProductDaoimpl implements ProductDao {
   private final Connection connection;

    public ProductDaoimpl() {
        connection = new MySQLConnector().getConnection();
    }

    @Override
    public void save(Product product) throws SQLException {
        PreparedStatement statement = connection.
                prepareStatement("insert into product(id,name, description,price) VALUES (?,?,?,?)");
        statement.setInt(1, product.getId());
        statement.setString(2, product.getName());
        statement.setString(3, product.getDescription());
        statement.setDouble(4,product.getPrice());
        statement.execute();
        statement.close();
    }

    @Override
    public void remove(int id) throws SQLException {
        PreparedStatement statement = connection.
                prepareStatement("DELETE from product where id = ?");
        statement.setInt(1,id);
        statement.execute();
        statement.close();
    }

    @Override
    public List<Product> getAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from product");
        List<Product> products = ProductMapper.mapProductsFromResultSet(resultSet);
        statement.close();
        return products;
    }
}
