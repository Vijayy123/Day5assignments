package com.vijay.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.productservice.entity.Product;
import com.vijay.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;

	public Product addProduct(Product product) {
		
		return productRepo.save(product);
	}

	public Product getProductById(Long productId) {
		Optional<Product> product = productRepo.findById(productId);
		return product.get();
	}

	public Product getProductByName(String productName) {
		Optional<Product> product = productRepo.findByName(productName);
		return product.get();
	}

}
