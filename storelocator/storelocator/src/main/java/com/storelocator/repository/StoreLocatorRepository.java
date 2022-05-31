package com.storelocator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storelocator.entity.Store;
@Repository
public interface StoreLocatorRepository extends JpaRepository<Store, Long>{

	
}
