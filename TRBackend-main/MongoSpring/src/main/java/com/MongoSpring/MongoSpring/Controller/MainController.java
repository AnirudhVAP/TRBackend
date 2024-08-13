package com.MongoSpring.MongoSpring.Controller;
import com.MongoSpring.MongoSpring.Model.AdminDetails;
import com.MongoSpring.MongoSpring.Model.McqCredentails;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import com.MongoSpring.MongoSpring.Repository.AdminRepo;
import com.MongoSpring.MongoSpring.Repository.MCQRepo;
import com.MongoSpring.MongoSpring.Service.HandleCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private final HandleCall service;
    private final MCQRepo mcqRepo;

    @Autowired
    public MainController(HandleCall service, MCQRepo mcqRepo) {
        this.service = service;
        this.mcqRepo = mcqRepo;
    }

    @PostMapping("/registration")
    public String postUserDetails(@RequestBody UserDetails userDetails) {
        service.postUserDetails(userDetails);
        return "POSTED UserDetails SUCCESSFULLY";
    }

    @PostMapping("/user/profile")
    public String postProfileDetails(@RequestBody ProfileDetails profileDetails) {
        service.postProfileDetails(profileDetails);
        return "POSTED ProfileDetails SUCCESSFULLY";
    }

    @PostMapping("/admin/mcq")
    public String postMCQcredentials(@RequestBody McqCredentails mcqCredentails) {
        service.postMCQcredentials(mcqCredentails);
        return "posted";
    }

    @PostMapping("/create/admin")
    public String postAdminDetails(@RequestBody AdminDetails adminDetails) {
        service.postAdminDetails(adminDetails);
        return "POSTED AdminDetails SUCCESSFULLY";
    }

    @GetMapping("/profile/mobile/{number}")
    public ProfileDetails getProfileDetails(@PathVariable long number) {
        return service.getProfileDetails(number);
    }

    @GetMapping("/mcq/questions")
    public List<McqCredentails> getQuestionsBySubject(@RequestParam String subject) {
        return mcqRepo.findAllBySubject(subject);
    }

    @GetMapping("/registration/{username}")
    public UserDetails getUserDetails(@PathVariable String username) {
        return service.getUserDetails(username);
    }

    @GetMapping("/registration/id/{id}")
    public UserDetails getUserDetailsbyid(@PathVariable String id) {
        return service.getUserDetailsbyid(id);
    }

    @GetMapping("/admin/verify/{username}")
    public AdminDetails getAdminDetails(@PathVariable String username) {
        return service.getAdminDetails(username);
    }

    @PostMapping("/chat")
    public String handleChatMessage(@RequestBody String message) {
        // Your chat message handling logic here
        return "Handled message: " + message;
    }
}
