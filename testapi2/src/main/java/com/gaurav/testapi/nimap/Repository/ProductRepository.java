package com.gaurav.testapi.nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.testapi.nimap.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
