package com.initialquiz.dao;

import com.initialquiz.dto.UserDTO;
import com.initialquiz.db.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public UserDAO() throws SQLException, ClassNotFoundException {
        conn = DBConnect.getConnection();
    }

    public UserDTO getDBUser(String username) {
        UserDTO dbUser = null;
        String sql = "SELECT * FROM user WHERE username = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();

            if (rs != null) {
                if (rs.next()) {
                    dbUser = new UserDTO();
                    dbUser.setUsername(rs.getString("username"));
                    dbUser.setPasswd(rs.getString("passwd"));
                    dbUser.setPoint(rs.getInt("point"));
                } else {
                    System.out.println("No results found.");
                }
            } else {
                System.out.println("ResultSet is null");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbUser;
    }

    public boolean createUser(UserDTO user) {
        boolean result = false;
        String sql = "INSERT INTO user (username, passwd) VALUES (?, ?)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPasswd());

            result = pstmt.executeUpdate() > 0;
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    // signup username 중복 확인
    // 중복 없을 시 false 반환
    // 중복 존재 시 true 반환
    public boolean isUsernameExists(String username) {
        boolean result = false;

        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            result = rs.getInt(1) > 0;
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
