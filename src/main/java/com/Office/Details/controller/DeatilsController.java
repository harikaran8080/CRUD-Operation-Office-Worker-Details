package com.Office.Details.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Office.Details.entity.DetailsEntity;
import com.Office.Details.service.ServiceImplement;

@RestController
@RequestMapping("/rest/api")
public class DeatilsController {
	@Autowired
	ServiceImplement implement;
	
	@PostMapping("/post")
	public  DetailsEntity post(@RequestBody  DetailsEntity detailsEntity) {
		return implement.post(detailsEntity);
		
	}
	@PostMapping("/postall")
	public List<DetailsEntity> postall(@RequestBody List<DetailsEntity> detailsEntities){
		return implement.postall(detailsEntities);
		
	}
	@GetMapping("/getall")
	public List<DetailsEntity>getall(){
		return implement.getall();
	}
	
	@GetMapping("/get/{id}")
	public Optional<DetailsEntity>get(@PathVariable int id){
		return implement.get(id);
	}
	@PutMapping("/update")
	public DetailsEntity update(@RequestBody DetailsEntity detailsEntity ) {
		return implement.update(detailsEntity);
		
	}
	@DeleteMapping("/delete/{id}")
	public String  delete(@PathVariable int id){
		return implement.delete(id);
	}
	


}
