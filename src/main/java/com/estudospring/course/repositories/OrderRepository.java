package com.estudospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
