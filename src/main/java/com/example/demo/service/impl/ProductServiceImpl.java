package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.enitity.Product;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }
}
