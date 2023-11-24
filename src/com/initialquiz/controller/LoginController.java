package com.initialquiz.controller;

import com.initialquiz.dto.UserDTO;
import com.initialquiz.frame.LoginFrame;
import com.initialquiz.service.QuizService;
import com.initialquiz.service.UserService;
import java.sql.SQLException;

public class LoginController {

    UserService userService;
    LoginFrame loginFrame;

    public LoginController(LoginFrame loginFrame, UserService userService) {
        this.userService = userService;
        this.loginFrame = loginFrame;
    }

    public void handleLogin(UserDTO loginUser) throws SQLException, ClassNotFoundException {
        System.out.println("Request login(" + loginUser.getUsername() + "," + loginUser.getPasswd() + ")");

        UserDTO dbUser = userService.login(loginUser);
        
        if (dbUser != null) {
            // InitGameController 호출
            InitGameController initGameController = new InitGameController(dbUser, new QuizService());
            initGameController.initializeGame();
            // LoginFrame 닫기
            loginFrame.dispose();

        } // login 실패
        else {
            // LoginFrame inputField 초기화
            loginFrame.resetLogin();
        }
    }
}
