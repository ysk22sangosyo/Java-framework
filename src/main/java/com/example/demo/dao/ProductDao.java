package com.example.demo.dao;

import com.example.demo.entity.Product;

public interface ProductDao {

	public Product findByProductID(Integer productId);
}
