package com.initialquiz.service;

import com.initialquiz.dao.QuizDAO;
import com.initialquiz.dto.QuizDTO;
import java.sql.SQLException;
import java.util.List;

public class QuizService {
    
    public List<QuizDTO> initializeQuiz() throws SQLException, ClassNotFoundException{
        QuizDAO quizDAO = new QuizDAO();
        List<QuizDTO> quizList = quizDAO.getQuizList();
        return quizList;
    }
}
