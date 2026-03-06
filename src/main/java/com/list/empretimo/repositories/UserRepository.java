package com.list.empretimo.repositories;

import com.list.empretimo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
