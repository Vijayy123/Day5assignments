package com.vijay.productservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Object>{

	Optional<Product> findByName(String productName);

}
