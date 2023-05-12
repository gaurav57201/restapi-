package com.gaurav.testapi.nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.testapi.nimap.Model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
