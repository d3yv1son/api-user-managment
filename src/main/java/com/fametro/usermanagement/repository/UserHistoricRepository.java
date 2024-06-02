package com.fametro.usermanagement.repository;

import com.fametro.usermanagement.entity.UserHistoric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHistoricRepository extends JpaRepository<UserHistoric, Long> {
}
