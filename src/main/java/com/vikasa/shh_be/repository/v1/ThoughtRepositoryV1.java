package com.vikasa.shh_be.repository.v1;

import com.vikasa.shh_be.model.Thought;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ThoughtRepositoryV1 extends JpaRepository<Thought,Long> {

}
