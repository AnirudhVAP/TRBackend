package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.Notification;
import com.MongoSpring.MongoSpring.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification sendNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        List<Notification> notifications = notificationRepository.findAll();
        Collections.reverse(notifications); // Reversing the list to implement LIFO order
        return notifications;
    }
}
