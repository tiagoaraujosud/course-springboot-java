package com.estudospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.course.entities.OrderItem;
import com.estudospring.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
