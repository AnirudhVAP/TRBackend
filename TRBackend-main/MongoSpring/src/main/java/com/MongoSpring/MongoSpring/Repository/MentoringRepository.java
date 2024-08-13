package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.MentoringRegister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentoringRepository extends MongoRepository<MentoringRegister, String> {
    // Custom query methods can be added here if needed
}