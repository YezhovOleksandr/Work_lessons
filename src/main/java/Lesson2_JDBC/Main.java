package Lesson2_JDBC;

import Lesson2_JDBC.dao.impl.ProductDaoimpl;
import Lesson2_JDBC.dao.impl.UserDaoImpl;
import Lesson2_JDBC.models.Product;
import Lesson2_JDBC.models.User;
import Lesson2_JDBC.services.ProductService;
import Lesson2_JDBC.services.UserService;
import Lesson2_JDBC.services.impl.ProductServiceImpl;
import Lesson2_JDBC.services.impl.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoImpl());
//        List<User> all = userService.getAll();
//        System.out.println(all);
//        User byId = userService.getById(2);
//        System.out.println(byId);
        ProductService productService = new ProductServiceImpl(new ProductDaoimpl());

//        Product product = new Product(2,"Test","Test",300);
//        productService.save(product);
//        productService.remove(2);
        System.out.println(productService.getAll());
    }
}
