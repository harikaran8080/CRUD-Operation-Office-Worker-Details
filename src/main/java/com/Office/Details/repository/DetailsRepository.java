package com.Office.Details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Office.Details.entity.DetailsEntity;

@Repository
public interface DetailsRepository extends JpaRepository<DetailsEntity, Integer> {

}
