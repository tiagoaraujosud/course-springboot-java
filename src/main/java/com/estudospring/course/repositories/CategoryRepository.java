package com.estudospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
