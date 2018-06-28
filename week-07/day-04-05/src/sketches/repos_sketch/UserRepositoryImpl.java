//package com.greenfoxacademy.tamagotchi.repositories.repos_sketch;
//
//import com.greenfoxacademy.tamagotchi.models.models_sketch.User;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class UserRepositoryImpl implements UserRepository {
//
//  private Map<String, User> users;
//
//  public UserRepositoryImpl() {
//    users = new HashMap<>();
//  }
//
//  public User finOneById(String username) {
//    return users.get(username);
//  }
//
//  public void save(User user) {
//    users.put(user.getName(), user);
//  }
//}
