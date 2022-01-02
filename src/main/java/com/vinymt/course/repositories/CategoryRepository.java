package com.vinymt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinymt.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
