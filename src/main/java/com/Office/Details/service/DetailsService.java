package com.Office.Details.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Office.Details.entity.DetailsEntity;
import com.Office.Details.repository.DetailsRepository;

@Service
public class DetailsService  implements ServiceImplement{
	@Autowired
	DetailsRepository detailsRepository ;

	@Override
	public DetailsEntity post(DetailsEntity detailsEntity) {
		return detailsRepository.save(detailsEntity);
	}

	@Override
	public List<DetailsEntity> postall(List<DetailsEntity> detailsEntities) {
		return detailsRepository.saveAll(detailsEntities);
	}

	@Override
	public List<DetailsEntity> getall() {
		return detailsRepository.findAll();
	}

	@Override
	public Optional<DetailsEntity> get(int id) {
		return detailsRepository.findById(id);
	}

	@Override
	public DetailsEntity update(DetailsEntity detailsEntity) {
		Optional<DetailsEntity>optional=detailsRepository.findById(detailsEntity.getId());
		DetailsEntity optional2 = optional.get();
		optional2.setId(detailsEntity.getId());
		optional2.setName(detailsEntity.getName());
		optional2.setAge(detailsEntity.getAge());
		optional2.setRoll(detailsEntity.getRoll());
		optional2.setExperience(detailsEntity.getExperience());
		return detailsRepository.save(detailsEntity);
	}

	@Override
	public String delete(int id) {
		detailsRepository.deleteById(id);
		return "Succesfully Deleted";
	}

	

	
	

}
