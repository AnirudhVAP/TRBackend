// package com.MongoSpring.MongoSpring.Controller;

// public class Hrcontroller {

// }
package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.HrQuestions;
import com.MongoSpring.MongoSpring.Service.HrService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hrQuestions")
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:5173", "http://192.168.1.10:8080"}) // Add this line
public class HrQuestionsController {
    private final HrService HrService;

    @Autowired
    public HrQuestionsController(HrService hrQuestionService) {
        this.HrService = hrQuestionService;
    }

    @PostMapping("/send")
    public ResponseEntity<HrQuestions> sendQuestions(@RequestBody HrQuestions hrQuestions) {
        HrQuestions savedQuestion = HrService.sendQuestions(hrQuestions);
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED);
    }

    @GetMapping("/getHrQuestions")
    public ResponseEntity<List<HrQuestions>> getHrQuestions() {
        List<HrQuestions>   Questions = HrService.getAllQuestions();
        return new ResponseEntity<>(Questions, HttpStatus.OK);
    }
}