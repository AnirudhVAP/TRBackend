package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.HrQuestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HrQuestionsRepo extends MongoRepository<HrQuestions, String> {
}