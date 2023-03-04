package com.daruo.springboormall.service.impl;

import com.daruo.springboormall.dao.ProductDao;
import com.daruo.springboormall.model.Product;
import com.daruo.springboormall.service.ProductService;
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
}
