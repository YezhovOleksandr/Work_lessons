package Lesson2_JDBC.services.impl;

import Lesson2_JDBC.dao.ProductDao;
import Lesson2_JDBC.models.Product;
import Lesson2_JDBC.services.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) {
        try {
            productDao.save(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            productDao.remove(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> getAll()  {
        List<Product> all = new ArrayList<>();
        try {
            all = productDao.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return all;
    }
}
