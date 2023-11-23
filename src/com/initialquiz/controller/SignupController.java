package com.initialquiz.controller;

import com.initialquiz.dto.UserDTO;
import com.initialquiz.frame.SignupFrame;
import com.initialquiz.service.UserService;
import java.sql.SQLException;

public class SignupController {

    SignupFrame signupFrame;
    UserService userService;

    public SignupController(SignupFrame signupFrame) {
        this.signupFrame = signupFrame;
        userService = new UserService();
    }

    public void handleSignup(UserDTO user) throws SQLException, ClassNotFoundException {
        System.out.println("Request signup(" + user.getUsername() + "," + user.getPasswd() + ")");

        if (userService.signup(user)) {

        } else {
            signupFrame.resetSignup();
        }
    }

}
