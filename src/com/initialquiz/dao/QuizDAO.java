package com.initialquiz.dao;

import com.initialquiz.db.DBConnect;
import com.initialquiz.dto.QuizDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuizDAO {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public QuizDAO() throws ClassNotFoundException {
        this.conn = DBConnect.getConnection();
    }
    
    
    public List<QuizDTO> getQuizList() throws SQLException {
        List<QuizDTO> quizList = new ArrayList<>();
        QuizDTO quiz;
        // 랜덤으로 quiz 10개 가져오는 SQL Qurey
        String sql = "SELECT * FROM quiz ORDER BY RAND() LIMIT 10";
        // 쿼리 준비
        pstmt = conn.prepareStatement(sql);
        // query 실행 및 결과 저장
        rs = pstmt.executeQuery();

        while (rs.next()) {
            // quiz 초기화
            quiz = new QuizDTO();
            // quiz setting 
            quiz.setInitialWord(rs.getString("initial_word"));
            quiz.setAnswer(rs.getString("answer"));
            quiz.setExplanation(rs.getString("explanation"));
            //quizList에 quiz 추가
            quizList.add(quiz);
        }
        return quizList;
    }
    
    

}
