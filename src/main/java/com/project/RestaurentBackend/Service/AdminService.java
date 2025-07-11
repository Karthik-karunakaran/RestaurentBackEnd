package com.project.RestaurentBackend.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.RestaurentBackend.AdminTable.Admin;
import com.project.RestaurentBackend.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepo;
	
	public List<Admin> getAllItems(){
		List<Admin> admin = new ArrayList<Admin>();
		adminRepo.findAll().forEach(admin1 -> admin.add(admin1));	
		return admin;
	}
	
	public String saveItems( String imageUrl, String foodName, Integer price, String category, String description ) {
		Admin admin = new Admin (imageUrl, foodName, price, category, description);
		adminRepo.save(admin);
		return "success";
	}
	
	public String updateItems(Integer foodId, String imageUrl, String foodName, Integer price, String category, String description ) {
		Optional<Admin> optional = adminRepo.findById(foodId);
		if(optional.isPresent()) {
			Admin admin = optional.get();
			admin.setImageUrl(imageUrl);
			admin.setFoodName(foodName);
			admin.setPrice(price);
			admin.setCategory(category);
			admin.setDescription(description);
			adminRepo.save(admin);
		}
		
		return "Success";
	}
	
	public void deleItem(Integer foodId) {
		adminRepo.deleteById(foodId);
	}
}
