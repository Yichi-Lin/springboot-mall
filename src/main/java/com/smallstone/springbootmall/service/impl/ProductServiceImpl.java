package com.smallstone.springbootmall.service.impl;

import com.smallstone.springbootmall.dao.ProductDao;
import com.smallstone.springbootmall.model.Product;
import com.smallstone.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId)
    {
        return productDao.getProductById(productId);
    }
}