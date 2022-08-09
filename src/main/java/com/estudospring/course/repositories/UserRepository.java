package com.estudospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
