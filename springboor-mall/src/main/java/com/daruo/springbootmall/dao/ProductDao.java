package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
