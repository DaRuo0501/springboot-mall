package com.daruo.springbootmall.dao;

import com.daruo.springbootmall.constant.ProductCategory;
import com.daruo.springbootmall.dto.ProductRequest;
import com.daruo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void  deleteProductById(Integer productId);

}
