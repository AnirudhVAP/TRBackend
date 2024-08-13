package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.HrQuestions;
import com.MongoSpring.MongoSpring.Repository.HrQuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {
    private final HrQuestionsRepo questionsRepository;

    @Autowired
    public HrService(HrQuestionsRepo questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    public HrQuestions sendQuestions(HrQuestions hrQuestions) {
        return questionsRepository.save(hrQuestions);

    }

    public List<HrQuestions> getAllQuestions() {
        List<HrQuestions> questions = questionsRepository.findAll();
        return questions;
    }
}
