package com.example.springtest;

import com.example.springtest.dto.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
  List<User> users = new ArrayList<>();

  public List<User> getAllUsers() {
    return users;
  }
}
