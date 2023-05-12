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

import com.gaurav.testapi.nimap.Model.Product;
import com.gaurav.testapi.nimap.Service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/api/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@DeleteMapping("/api/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		 service.deleteProduct(id);
		 return" Product removed";
	}
	
	@PutMapping("/api/updateProduct/{id}")
	public Product updateProduct(@PathVariable int id ,@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/api/getProduct/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@GetMapping("/api/getProducts")
	public Page<Product> getProducts(Pageable page){
		return service.getProducts(page);
	}
}
