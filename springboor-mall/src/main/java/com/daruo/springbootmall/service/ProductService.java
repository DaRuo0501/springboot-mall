package com.daruo.springbootmall.service;

import com.daruo.springbootmall.dto.ProductRequest;
import com.daruo.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId, ProductRequest productRequest);

}
