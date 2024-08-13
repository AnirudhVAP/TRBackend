package com.MongoSpring.MongoSpring.Controller;


import com.MongoSpring.MongoSpring.Model.MentoringRegister;
import com.MongoSpring.MongoSpring.Service.MentoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mentoring")
public class MentoringController {

    private final MentoringService mentoringService;

    @Autowired
    public MentoringController(MentoringService mentoringService) {
        this.mentoringService = mentoringService;
    }

    @PostMapping("/register")
    public ResponseEntity<MentoringRegister> registerMentoring(@RequestBody MentoringRegister mntoringRegister) {
        MentoringRegister savedRegister = mentoringService.saveMentoringRegister(mntoringRegister);
        return ResponseEntity.ok(savedRegister);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MentoringRegister>> getAllRegisters() {
        List<MentoringRegister> registers = mentoringService.getAllMentoringRegisters();
        return ResponseEntity.ok(registers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MentoringRegister> getRegisterById(@PathVariable String id) {
        MentoringRegister register = mentoringService.getMentoringRegisterById(id);
        return ResponseEntity.ok(register);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegister(@PathVariable String id) {
        mentoringService.deleteMentoringRegister(id);
        return ResponseEntity.noContent().build();
    }
}