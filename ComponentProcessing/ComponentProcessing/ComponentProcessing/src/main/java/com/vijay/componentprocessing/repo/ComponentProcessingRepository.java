package com.vijay.componentprocessing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.componentprocessing.entity.ProcessResponse;

public interface ComponentProcessingRepository extends JpaRepository<ProcessResponse, Long> {

}
