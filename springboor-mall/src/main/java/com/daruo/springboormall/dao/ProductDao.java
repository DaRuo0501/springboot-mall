package com.daruo.springboormall.dao;

import com.daruo.springboormall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
