package com.initialquiz.service;

import com.initialquiz.dao.UserDAO;
import com.initialquiz.dto.UserDTO;
import java.sql.SQLException;

public class UserService {

    public boolean login(UserDTO loginUser) throws SQLException, ClassNotFoundException {
        UserDAO userDAO = new UserDAO();
        UserDTO dbUser = userDAO.getDBUser(loginUser.getUsername());

        // dbuser null 검증 
        if (dbUser == null) {
            System.out.println("Login Failed ...");
            return false;
        }
        // username 일치 비교
        if (dbUser.getUsername().equals(loginUser.getUsername())) {
            // passwd 일치 비교
            if (dbUser.getPasswd().equals(loginUser.getPasswd())) {
                System.out.println("Login Sucess!");
                return true;
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            return false;
        }

        return false;
    }

    public boolean signup(UserDTO user) throws SQLException, ClassNotFoundException {
        UserDAO userDAO = new UserDAO();

        // User 정보 유효성 검사
        if (isUsereValid(user)) {
            // Username 중복 검사
            if (!userDAO.isUsernameExists(user.getUsername())) {
                // user 생성 검사
                if (userDAO.createUser(user)) {
                    System.out.println("Signup Success!");
                } else {
                    System.out.println("Signup Failed ...");
                }
            } else {
                System.out.println("Username already exists");
                System.out.println("Signup Failed ...");
            }
        } else {
            System.out.println("Validation check failed");
            System.out.println("Signup Failed ...");
            return false;
        }

        return false;
    }

    // User 정보 유효성 검사 함수
    private boolean isUsereValid(UserDTO user) {
        // 공백 검사
        if (user.getUsername().equals("") || user.getPasswd().equals("")) {
            return false;
        }
        return true;
    }
}
