package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.enitity.Product;
import com.example.demo.service.impl.ProductService;


@SpringBootApplication
public class SpringDiProductApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
	            SpringApplication.run(SpringDiProductApplication.class, args);

	        ProductService productService = context.getBean(ProductService.class);
	        List<Product> list = productService.findAll();
	            System.out.println("【products】");
	        for (Product u : list) {
	            System.out.println(u.getProductInfo());
	}
	}
}
