package com.project.RestaurentBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.RestaurentBackend.AdminTable.Admin;
import com.project.RestaurentBackend.Service.AdminService;

@RestController
@CrossOrigin(origins = {"https://karthik-karunakaran.github.io/RestaurentAdmin","https://restaurentuser.netlify.app"})
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/get")
	public List<Admin> getAllItems(){
		return adminService.getAllItems();
	}
	
	@PostMapping("/post")
	private String saveItems( @RequestParam String imageUrl, @RequestParam String foodName, @RequestParam Integer price, @RequestParam String category, @RequestParam String description) {
		adminService.saveItems( imageUrl, foodName, price, category, description);
		return "Success";
	}
	
	
	@PostMapping("/update")
	public String updateItem(@RequestParam("foodId") Integer FoodId,
			@RequestParam("imageUrl") String imageUrl,
			@RequestParam("foodName") String foodName, 
			@RequestParam("price") Integer price, 
			@RequestParam("category") String category,
			@RequestParam(value="description") String description) {
		
		adminService.updateItems(FoodId, imageUrl, foodName, price, category, description);
		return null;
	}
	
	@PostMapping("/delete")
	public String delteItem(@RequestParam("foodId") Integer FoodId) {
		adminService.deleItem(FoodId);
		return "success";
	}
}