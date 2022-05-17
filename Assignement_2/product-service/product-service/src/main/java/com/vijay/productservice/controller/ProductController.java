package com.vijay.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.productservice.entity.Product;
import com.vijay.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	
	@Autowired
	private ProductService productService;


	@PostMapping(value = "saveProd")
	public Product saveDepartment(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/id/{id}")
	public Product getProductById(@PathVariable("id") Long productId) {
		return productService.getProductById(productId);
	}
	
	@GetMapping("/name/{name}")
	public Product getProductByName(@PathVariable("name") String productName) {
		return productService.getProductByName(productName);
	}
}
