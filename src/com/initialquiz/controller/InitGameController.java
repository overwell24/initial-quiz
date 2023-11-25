package com.initialquiz.controller;

import com.initialquiz.dto.QuizDTO;
import com.initialquiz.dto.UserDTO;
import com.initialquiz.frame.InGameFrame;
import com.initialquiz.service.QuizService;
import java.sql.SQLException;
import java.util.List;

public class InitGameController {

    QuizService quizService;
    UserDTO user;

    // 생성자를 통해 QuizService와 UserDTO 주입
    public InitGameController(UserDTO user, QuizService quizService) {
        this.user = user;
        this.quizService = quizService;
    }

    // 게임 초기화 함수
    public void initializeGame() throws SQLException, ClassNotFoundException {
        // QuizList 초기화
        List<QuizDTO> quizList = quizService.initializeQuiz();
        // InGameFrame 생성 및 퀴즈 데이터, 유저 데이터 전달
        InGameFrame inGameFrame = new InGameFrame(user, quizList);
        // InGameFrame을 화면에 표시
        inGameFrame.setVisible(true);
    }
}
