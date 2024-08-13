package com.MongoSpring.MongoSpring.Repository;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepo extends MongoRepository<ProfileDetails,String> {
    ProfileDetails findByname(String name);
    ProfileDetails findBymobile(long mobile);
}
