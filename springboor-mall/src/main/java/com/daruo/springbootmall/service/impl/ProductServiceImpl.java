package com.daruo.springbootmall.service.impl;

import com.daruo.springbootmall.dao.ProductDao;
import com.daruo.springbootmall.dto.ProductRequest;
import com.daruo.springbootmall.model.Product;
import com.daruo.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
