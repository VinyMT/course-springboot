package com.vinymt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinymt.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
