package com.initialquiz.frame;

import com.initialquiz.controller.InitGameController;
import com.initialquiz.controller.UserPointController;
import com.initialquiz.dao.UserDAO;
import com.initialquiz.dto.QuizDTO;
import com.initialquiz.dto.UserDTO;
import com.initialquiz.service.QuizService;
import com.initialquiz.service.UserService;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

public class InGameFrame extends javax.swing.JFrame {

    UserDTO user;
    List<QuizDTO> quizList;
    int quizCnt;

    public InGameFrame() {
        initComponents();
        messageBoard.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.setBorder(null);
    }

    // 생성자 의존성 주입
    public InGameFrame(UserDTO user, List<QuizDTO> quizList) throws SQLException {
        initComponents();
        // messageBoard 테두리 없애기
        messageBoard.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.setBorder(null);

        // InGameFrame 접속 메세지 
        System.out.println("=======InGameFrame=======");
        System.out.println("Entered Quiz Game: " + user.getUsername());
        // user, quizList 초기화
        this.user = user;
        this.quizList = quizList;
        // 게임 초기 설정
        initGame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inGameBackground = new javax.swing.JPanel();
        initialWordLabel = new javax.swing.JLabel();
        explanationLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        messageField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userPointLabel = new javax.swing.JLabel();
        quizCntLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageBoard = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inGameBackground.setBackground(new java.awt.Color(74, 100, 90));
        inGameBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 10));

        initialWordLabel.setFont(new java.awt.Font("BM Hanna Pro", 0, 36)); // NOI18N
        initialWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        initialWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialWordLabel.setText("ㄱㄴ");

        explanationLabel.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        explanationLabel.setForeground(new java.awt.Color(255, 255, 255));
        explanationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        explanationLabel.setText(" 저쩌구 어쩌구 저쩌구");
        explanationLabel.setToolTipText("");

        submitBtn.setText("전송");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("포인트");

        userPointLabel.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        userPointLabel.setForeground(new java.awt.Color(255, 255, 255));
        userPointLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userPointLabel.setText("0");

        quizCntLabel.setFont(new java.awt.Font("BM Hanna Pro", 0, 24)); // NOI18N
        quizCntLabel.setForeground(new java.awt.Color(255, 255, 255));
        quizCntLabel.setText("1/10");

        messageBoard.setEditable(false);
        messageBoard.setBackground(new java.awt.Color(74, 100, 90));
        messageBoard.setColumns(20);
        messageBoard.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        messageBoard.setForeground(new java.awt.Color(255, 255, 255));
        messageBoard.setRows(5);
        messageBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(messageBoard);

        javax.swing.GroupLayout inGameBackgroundLayout = new javax.swing.GroupLayout(inGameBackground);
        inGameBackground.setLayout(inGameBackgroundLayout);
        inGameBackgroundLayout.setHorizontalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(userPointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(initialWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quizCntLabel)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addComponent(messageField)
                .addGap(0, 0, 0)
                .addComponent(submitBtn))
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inGameBackgroundLayout.setVerticalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inGameBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPointLabel))
                    .addComponent(quizCntLabel)
                    .addComponent(initialWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explanationLabel)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inGameBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inGameBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // inputField text 가져오기
        String msg = messageField.getText();
        System.out.println(user.getUsername() + " message: " + msg);
        // inputField 초기화
        messageField.setText("");
        // messageBoard에 message 추가
        String msgList = messageBoard.getText();
        messageBoard.setText(msgList + "\n" + user.getUsername() + ": " + msg);

        // 정답 체크
        if (answerMatching(msg)) {
            try {
                // point 올리기
                updatePoint();
                // 다음 퀴즈로 넘어가기
                updateQuiz();
            } catch (SQLException ex) {
                Logger.getLogger(InGameFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InGameFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void updatePoint() throws SQLException, ClassNotFoundException {
        // point 업데이트
        UserPointController userPointController = new UserPointController(new UserService());
        userPointController.handleIncreasePoint(user.getUsername(), user.getPoint());
        // user 업데이트
        UserDAO userDAO = new UserDAO();
        user = userDAO.getDBUser(user.getUsername());
        // userPointLabel 업데이트
        userPointLabel.setText(String.valueOf(user.getPoint()));
    }

    private void updateQuiz() throws SQLException, ClassNotFoundException {

        // quizCnt 업데이트
        quizCnt++;
        
        // 10개 quiz 끝나면 새로운 InGameFrame 생성
        if (quizCnt > 9) {
            // 현재 InGameFrame 종료
            this.dispose();
            // 새로운 InGameFrame 생성
            InitGameController initGameController = new InitGameController(user, new QuizService());
            initGameController.initializeGame();
        } else {
            // 초성 업데이트
            initialWordLabel.setText(quizList.get(quizCnt).getInitialWord());
            // 설명 업데이트
            explanationLabel.setText(quizList.get(quizCnt).getExplanation());
            // quizCntLabel 업데이트
            quizCntLabel.setText((quizCnt + 1) + "/10");
        }

    }

    private void initGame() {
        // quizCnt 초기화
        quizCnt = 0;
        // 포인트 초기화
        userPointLabel.setText(String.valueOf(user.getPoint()));
        // 초성 초기화 
        initialWordLabel.setText(quizList.get(quizCnt).getInitialWord());
        // 설명 초기화 
        explanationLabel.setText(quizList.get(quizCnt).getExplanation());
        // quizCntLabel 초기화
        quizCntLabel.setText((quizCnt + 1) + "/10");
    }

    private boolean answerMatching(String userAnswer) {
        if (userAnswer.equals(quizList.get(quizCnt).getAnswer())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InGameFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel explanationLabel;
    private javax.swing.JPanel inGameBackground;
    private javax.swing.JLabel initialWordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageBoard;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel quizCntLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel userPointLabel;
    // End of variables declaration//GEN-END:variables
}
