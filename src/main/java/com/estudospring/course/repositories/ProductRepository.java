package com.estudospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
