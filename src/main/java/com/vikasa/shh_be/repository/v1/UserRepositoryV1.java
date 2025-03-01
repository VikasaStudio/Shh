package com.vikasa.shh_be.repository.v1;

import com.vikasa.shh_be.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserRepositoryV1 extends JpaRepository<User,Long> {
    
}
