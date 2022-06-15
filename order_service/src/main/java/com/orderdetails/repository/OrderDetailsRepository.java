package com.orderdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderdetails.entity.OrderLine;

public interface OrderDetailsRepository extends JpaRepository<OrderLine, Long>{

}
