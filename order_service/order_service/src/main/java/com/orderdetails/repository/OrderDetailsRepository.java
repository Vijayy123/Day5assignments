package com.orderdetails.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderdetails.entity.Order;

@Repository
public interface OrderDetailsRepository extends JpaRepository<Order, Long>{

	Optional<Order> findById(Long orderId);

	List<Order> findByOrderLines_Address_Pincode(int pincode);

}
