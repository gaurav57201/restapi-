package com.gaurav.testapi.nimap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gaurav.testapi.nimap.Model.Category;
import com.gaurav.testapi.nimap.Repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public Category saveCategory(Category category) {
		return repository.save(category);
		
	}
	
	public  String deleteCategory(int id) {
		repository.deleteById(id);
		return "Category removed .";
	}
	
	public Category updateCategory(Category category) {
		return repository.save(category);
	}
	
	public Category getCategoryById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Page<Category> getCategorys(Pageable page){
		return repository.findAll(page);
	}
}
