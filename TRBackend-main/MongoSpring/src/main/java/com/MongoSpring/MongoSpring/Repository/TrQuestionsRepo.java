package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.TrQuestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrQuestionsRepo extends MongoRepository<TrQuestions, String> {
}