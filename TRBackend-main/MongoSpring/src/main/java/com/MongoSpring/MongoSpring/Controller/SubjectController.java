package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.SubjectDetails;
import com.MongoSpring.MongoSpring.Service.SubjectService;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController

@RequestMapping("/api/subjects")

public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/add")
    public String createSubject(@RequestParam String subjectName,
            @RequestParam("subjectIcon") MultipartFile subjectIcon) {
        return subjectService.createSubject(subjectName, subjectIcon);
    }

    @GetMapping("/getsubjects")
    public List<SubjectDetails> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

}
