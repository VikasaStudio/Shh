package com.vikasa.shh_be.service.v1;

import com.vikasa.shh_be.repository.v1.ThoughtRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThoughtServiceV1 {
    @Autowired
    ThoughtRepositoryV1 thoughtRepo;
}
