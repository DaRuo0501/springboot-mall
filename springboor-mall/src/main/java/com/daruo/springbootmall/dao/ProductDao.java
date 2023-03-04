package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.dto.ProductRequest;
import com.daruo.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
