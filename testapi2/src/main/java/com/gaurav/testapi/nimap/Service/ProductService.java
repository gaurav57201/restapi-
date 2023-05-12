package com.gaurav.testapi.nimap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gaurav.testapi.nimap.Model.Product;
import com.gaurav.testapi.nimap.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public  String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed .";
	}
	
	public Product updateProduct(Product product) {
		return repository.save(product);
	}
	
	public Product getProduct(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Page<Product> getProducts(Pageable page){
		return repository.findAll(page);
	}
}
