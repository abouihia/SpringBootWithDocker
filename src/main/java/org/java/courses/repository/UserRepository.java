package org.java.courses.repository;

import java.util.Optional;

import org.java.courses.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository   extends JpaRepository<User, Integer>{

	
	Optional<User> findByUserName(String userName);	
}
