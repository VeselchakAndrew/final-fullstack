package com.example.springtest;

import com.example.springtest.DTO.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void returnTrue_whenUsersNotAdded() {
    UserService userService = new UserService();
    List<User> users = userService.getAllUsers();
    assertTrue(users.isEmpty());

  }
}