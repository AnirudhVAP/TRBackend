package com.MongoSpring.MongoSpring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MongoSpring.MongoSpring.Model.McqCredentails;

import java.util.List;


public interface MCQRepo extends MongoRepository<McqCredentails, String> {
    McqCredentails findByquestion(String question);
    List<McqCredentails> findAllBySubject(String subject);
}