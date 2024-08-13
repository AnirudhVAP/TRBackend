package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.User;
import com.MongoSpring.MongoSpring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) throws IllegalArgumentException {
        // Check if email already exists
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("Email is already in use.");
        }
        return userRepository.save(user);
    }

    public Optional<User> authenticateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User updateUser(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            User userToUpdate = existingUser.get();
            userToUpdate.setFullName(user.getFullName());
            userToUpdate.setMobileNumber(user.getMobileNumber());
            userToUpdate.setCollegeName(user.getCollegeName());
            userToUpdate.setProfileImage(user.getProfileImage()); // Handle the image update
            // You may need to handle password updates separately if applicable
            return userRepository.save(userToUpdate);
        } else {
            throw new IllegalArgumentException("User not found for the email: " + user.getEmail());
        }
    }
}
