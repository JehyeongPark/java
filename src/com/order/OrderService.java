package com.order;

import com.product.Product;
import com.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }

}
