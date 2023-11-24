package com.initialquiz.frame;

import com.initialquiz.dto.QuizDTO;
import com.initialquiz.dto.UserDTO;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;

public class InGameFrame extends javax.swing.JFrame {

    UserDTO user;
    List<QuizDTO> quizList;

    public InGameFrame() {
        initComponents();
        jTextArea1.setBorder(BorderFactory.createEmptyBorder());

    }

    // 생성자 의존성 주입
    public InGameFrame(UserDTO user, List<QuizDTO> quizList) throws SQLException {
        initComponents();
        jTextArea1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.setBorder(null);


        // InGameFrame 접속 메세지 
        System.out.println("=======InGameFrame=======");
        System.out.println("Entered Quiz Game: " + user.getUsername());
        // user, quizList 초기화
        this.user = user;
        this.quizList = quizList;

        // 포인트 초기화
        userPointLabel.setText(String.valueOf(user.getPoint()));
        System.out.println(String.valueOf(user.getPoint()));
        // 초성 초기화 
        initialWordLabel.setText(quizList.get(0).getInitialWord());
        // 설명 초기화 
        explanationLabel.setText(quizList.get(0).getExplanation());
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
        jTextArea1 = new javax.swing.JTextArea();

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

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(74, 100, 90));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("asdsadsadsa\ndsadsadsadsad\nsadsadsadsadsad\nasdsadsadsadsads\ndasdsadsd\nasddsad");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout inGameBackgroundLayout = new javax.swing.GroupLayout(inGameBackground);
        inGameBackground.setLayout(inGameBackgroundLayout);
        inGameBackgroundLayout.setHorizontalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(userPointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(initialWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(quizCntLabel)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addComponent(messageField)
                .addGap(0, 0, 0)
                .addComponent(submitBtn))
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        inGameBackgroundLayout.setVerticalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inGameBackgroundLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quizCntLabel)
                            .addComponent(initialWordLabel)))
                    .addGroup(inGameBackgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPointLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explanationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        String input = messageField.getText();
        System.out.println(user.getUsername() + " message: " + input);
        // inputField 초기화
        messageField.setText("");

    }//GEN-LAST:event_submitBtnActionPerformed

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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel quizCntLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel userPointLabel;
    // End of variables declaration//GEN-END:variables
}
