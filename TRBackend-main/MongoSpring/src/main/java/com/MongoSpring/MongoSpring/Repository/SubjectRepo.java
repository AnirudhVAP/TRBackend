package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.SubjectDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepo extends MongoRepository<SubjectDetails, String> {
}
