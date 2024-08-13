package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface NotificationRepository extends MongoRepository<Notification, String> {
}
