package com.MongoSpring.MongoSpring.Controller;
import com.MongoSpring.MongoSpring.Model.TrQuestions;
import com.MongoSpring.MongoSpring.Service.TrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController

@RequestMapping("/trquestions")
public class TrQuestionsController{
    private final TrService Service;
    @Autowired
    public TrQuestionsController(TrService service) {
        Service = service;
    }
    @GetMapping("/get")
    public Collection<TrQuestions> getquestions(){
        return Service.getquestions();
    };
    @PostMapping("/post")
    public void postquestions(@RequestBody TrQuestions questions){
        Service.postquestions(questions);

    };
}