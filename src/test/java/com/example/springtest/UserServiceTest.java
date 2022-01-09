package com.example.springtest;

import com.example.springtest.dto.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class UserServiceTest {


  @Test
  void return_UsersCount_When_UsersListNotEmpty() {
    UserService userService = new UserService();
    userService.addUser(new User(1, "FirstName1", "LastName1"));
    userService.addUser(new User(2, "FirstName2", "LastName2"));
    userService.addUser(new User(3, "FirstName3", "LastName3"));

    assertEquals(3, userService.getAllUsers().size());

  }


}