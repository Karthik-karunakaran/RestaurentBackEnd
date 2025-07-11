package com.project.RestaurentBackend.AdminTable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int FoodId;
	
	@Column(length=5000)
	private String ImageUrl;
	private String FoodName;
	private int Price;
	private String Category;
	
	@Column(length=1000)
	private String Description;
	public int getFoodId() {
		return FoodId;
	}
	public void setFoodId(Integer foodId) {
		FoodId = foodId;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Admin( String imageUrl, String foodName, int price, String category, String description) {
		super();
		ImageUrl = imageUrl;
		FoodName = foodName;
		Price = price;
		Category = category;
		Description = description;
	}
	public Admin() {
		super();
	}
	
	
}
