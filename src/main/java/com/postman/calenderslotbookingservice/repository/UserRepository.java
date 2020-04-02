package com.postman.calenderslotbookingservice.repository;

import com.postman.calenderslotbookingservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
