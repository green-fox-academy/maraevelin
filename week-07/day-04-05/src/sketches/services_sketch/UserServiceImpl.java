//package com.greenfoxacademy.tamagotchi.services.services_sketch;
//
//import com.greenfoxacademy.tamagotchi.models.models_sketch.User;
//import com.greenfoxacademy.tamagotchi.repositories.repos_sketch.UserRepository;
//import com.greenfoxacademy.tamagotchi.repositories.repos_sketch.UserRepositoryImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//  UserRepository userRepository;
//
//  @Autowired
//  public UserServiceImpl(UserRepositoryImpl userRepository) {
//    this.userRepository = userRepository;
//  }
//
//  public void login(String username) {
//    if (userRepository.finOneById(username) == null) {
//      userRepository.save(new User(username));
//    }
//  }
//
//  public User getUser(String username) {
//    return userRepository.finOneById(username);
//  }
//
//}
