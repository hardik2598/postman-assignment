package com.postman.calenderslotbookingservice.repository;

import com.postman.calenderslotbookingservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
