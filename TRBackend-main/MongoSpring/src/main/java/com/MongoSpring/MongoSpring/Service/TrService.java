package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.TrQuestions;
import com.MongoSpring.MongoSpring.Repository.TrQuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrService {
     private final TrQuestionsRepo repo;

    public TrService(TrQuestionsRepo repo) {
        this.repo = repo;
    }

    public List<TrQuestions> getquestions(){
        return repo.findAll();
    };


    public void postquestions(TrQuestions questions) {
        repo.save(questions);
    }
}
