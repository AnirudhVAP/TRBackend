package com.MongoSpring.MongoSpring.Repository;


import com.MongoSpring.MongoSpring.Model.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserDetails,String>{
    UserDetails findByusername(String username);
    UserDetails findByid(String id);
}
