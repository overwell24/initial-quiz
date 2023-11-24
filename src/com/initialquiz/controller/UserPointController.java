package com.initialquiz.controller;

import com.initialquiz.service.UserService;
import java.sql.SQLException;

public class UserPointController {
    
    UserService userService;
    public UserPointController(UserService userService) {
        this.userService = userService;
    }
    
    public void handleIncreasePoint(String username, int point) throws SQLException, ClassNotFoundException{
        userService.increasePoint(username, point);
    }
    
    
}
