package com.MongoSpring.MongoSpring.Repository;
import com.MongoSpring.MongoSpring.Model.AdminDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<AdminDetails,String>{
    AdminDetails findByusername(String username);
}
