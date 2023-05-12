package com.gaurav.testapi.nimap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.testapi.nimap.Model.Category;
import com.gaurav.testapi.nimap.Service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@PostMapping("/api/addCategory")
	public Category addCategory(@RequestBody Category category) {
		return service.saveCategory(category);
	}
	
	@DeleteMapping("/api/deleteCategory/{id}")
	public String deletebyid(@PathVariable int id) {
		service.deleteCategory(id);
		return "Category removed.. ";
	}
	
	@PutMapping("/api/updateCategory/{id}")
	public Category updateCategory(@PathVariable int id ,@RequestBody Category category) {
		return service.saveCategory(category);
	}
	
	@GetMapping("/api/getCategory/{id}")
	public Category getCategoryById(@PathVariable int id) {
		return service.getCategoryById(id);
	}
	@GetMapping("/api/getCategorys")
	public Page<Category> getCategorys(Pageable page){
		return service.getCategorys(page);
	}
	
}
