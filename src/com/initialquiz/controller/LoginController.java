package com.initialquiz.controller;

import com.initialquiz.dto.UserDTO;
import com.initialquiz.frame.InGameFrame;
import com.initialquiz.frame.LoginFrame;
import com.initialquiz.service.UserService;
import java.sql.SQLException;

public class LoginController {

    UserService userService;
    LoginFrame loginFrame;

    public LoginController(LoginFrame loginFrame) {
        this.userService = new UserService();
        this.loginFrame = loginFrame;
    }

    public void handleLogin(UserDTO loginUser) throws SQLException, ClassNotFoundException {
        System.out.println("Request login(" + loginUser.getUsername() + "," + loginUser.getPasswd() + ")");

        // login 성공
        if (userService.login(loginUser)) {
            // main frame 이동
            InGameFrame inGameFrame = new InGameFrame();
            inGameFrame.setVisible(true);
            // login frame 닫기
            loginFrame.dispose();
        } // login 실패
        else {
            loginFrame.resetLogin();
        }
    }
}
