package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.MentoringRegister;
import com.MongoSpring.MongoSpring.Repository.MentoringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentoringService {

    private final MentoringRepository mentoringRepository;

    @Autowired
    public MentoringService(MentoringRepository mentoringRepository) {
        this.mentoringRepository = mentoringRepository;
    }

    public MentoringRegister saveMentoringRegister(MentoringRegister mntoringRegister) {
        return mentoringRepository.save(mntoringRegister);
    }

    public List<MentoringRegister> getAllMentoringRegisters() {
        return mentoringRepository.findAll();
    }

    public MentoringRegister getMentoringRegisterById(String id) {
        Optional<MentoringRegister> register = mentoringRepository.findById(id);
        return register.orElse(null);
    }



    public void deleteMentoringRegister(String id) {
        mentoringRepository.deleteById(id);
    }
}