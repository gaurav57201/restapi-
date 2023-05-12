package com.gaurav.testapi.nimap.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	private int id;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + ", brand=" + brand + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	private String type;
	private String brand;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER )
	public List<Product> product=new ArrayList<>();
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

	
	
}
