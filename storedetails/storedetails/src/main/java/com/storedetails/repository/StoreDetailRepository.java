package com.storedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storedetails.entity.Store;
@Repository
public interface StoreDetailRepository extends JpaRepository<Store, Long> {

}
