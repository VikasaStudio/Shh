package com.vikasa.shh_be.repository;

import com.vikasa.shh_be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
