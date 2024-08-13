package com.MongoSpring.MongoSpring.Service;
import com.MongoSpring.MongoSpring.Model.AdminDetails;
import com.MongoSpring.MongoSpring.Model.McqCredentails;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import com.MongoSpring.MongoSpring.Repository.AdminRepo;
import com.MongoSpring.MongoSpring.Repository.MCQRepo;
import com.MongoSpring.MongoSpring.Repository.UserRepo;
import com.MongoSpring.MongoSpring.Repository.ProfileRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HandleCall {
    private final UserRepo repository;
    private final ProfileRepo repository1;
    private final AdminRepo repository2;
    private final MCQRepo repository3;

    public HandleCall(UserRepo repository, ProfileRepo repository1, AdminRepo repository2, MCQRepo repository3) {
        this.repository = repository;
        this.repository1 = repository1;
        this.repository2 = repository2;
        this.repository3 = repository3;
    }

    public UserDetails getUserDetails(String user) {
        return repository.findByusername(user);
    }

    public UserDetails getUserDetailsbyid(String user) {
        return repository.findByid(user);
    }

    public void postUserDetails(UserDetails userDetails) {
        repository.insert(userDetails);
    }

    public void postProfileDetails(ProfileDetails profileDetails) {
        repository1.insert(profileDetails);
    }

    public ProfileDetails getProfileDetails(long user) {
        return repository1.findBymobile(user);
    }

    public void postAdminDetails(AdminDetails adminDetails) {
        repository2.insert(adminDetails);
    }

    public AdminDetails getAdminDetails(String username) {
        return repository2.findByusername(username);
    }

    public McqCredentails getMcqCredentails(String question) {
        return repository3.findByquestion(question);
    }

    public void postMCQcredentials(McqCredentails mcqCredentails) {
        repository3.insert(mcqCredentails);
    }

    // New method to get all MCQ questions
    public List<McqCredentails> getAllMcqCredentails() {
        return repository3.findAll();
    }
}
