package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsBySubject(String subjectName);
}
