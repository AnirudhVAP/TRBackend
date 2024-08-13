package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.Notification;
import com.MongoSpring.MongoSpring.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:5173", "http://192.168.1.10:8080"})
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/send")
    public ResponseEntity<Notification> sendNotification(@RequestBody Notification notification) {
        Notification savedNotification = notificationService.sendNotification(notification);
        return new ResponseEntity<>(savedNotification, HttpStatus.CREATED);
    }
    @GetMapping("/getNotifications")
    public ResponseEntity<List<Notification>> getAllNotifications() {
        List<Notification> notifications = notificationService.getAllNotifications();
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }
}