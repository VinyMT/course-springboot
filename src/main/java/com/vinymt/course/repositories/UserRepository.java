package com.vinymt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinymt.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
