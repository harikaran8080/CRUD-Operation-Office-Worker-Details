package com.Office.Details.service;

import java.util.List;
import java.util.Optional;

import com.Office.Details.entity.DetailsEntity;

public interface ServiceImplement {

	DetailsEntity post(DetailsEntity detailsEntity);

	List<DetailsEntity> postall(List<DetailsEntity> detailsEntities);

	List<DetailsEntity> getall();

	Optional<DetailsEntity> get(int id);

	DetailsEntity update(DetailsEntity detailsEntity);

	String delete(int id);

	



	

}
