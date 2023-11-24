package com.initialquiz.service;

import com.initialquiz.dao.UserDAO;
import com.initialquiz.dto.UserDTO;
import java.sql.SQLException;

public class UserService {
    
    UserDAO userDAO;
    
    public UserDTO login(UserDTO loginUser) throws SQLException, ClassNotFoundException {
        userDAO = new UserDAO();
        UserDTO dbUser = userDAO.getDBUser(loginUser.getUsername());

        // dbuser null 검증 
        if (dbUser == null) {
            System.out.println("Login Failed ...");
            return null;
        }
        // username 일치 비교
        if (dbUser.getUsername().equals(loginUser.getUsername())) {
            // passwd 일치 비교
            if (dbUser.getPasswd().equals(loginUser.getPasswd())) {
                System.out.println("Login Sucess!");
                return dbUser;
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            return null;
        }

        return null;
    }

    public boolean signup(UserDTO user) throws SQLException, ClassNotFoundException {
        userDAO = new UserDAO();

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
    
    public void increasePoint(String username, int point) throws SQLException, ClassNotFoundException{
        userDAO = new UserDAO();
        userDAO.updatePoint(username, point);
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
