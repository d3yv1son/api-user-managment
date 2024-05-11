package com.fametro.usermanagement.repository;

import com.fametro.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
