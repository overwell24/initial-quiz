package com.initialquiz.frame;

import javax.swing.JButton;

public class InGameFrame extends javax.swing.JFrame {

    public InGameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inGameBackground = new javax.swing.JPanel();
        initialWord = new javax.swing.JLabel();
        explanation = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inGameBackground.setBackground(new java.awt.Color(74, 100, 90));
        inGameBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 10));

        initialWord.setFont(new java.awt.Font("BM Hanna Pro", 0, 36)); // NOI18N
        initialWord.setForeground(new java.awt.Color(255, 255, 255));
        initialWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialWord.setText("ㄲㄴ");

        explanation.setFont(new java.awt.Font("BM Hanna Pro", 0, 13)); // NOI18N
        explanation.setForeground(new java.awt.Color(255, 255, 255));
        explanation.setText("어쩌구 저쩌구 어쩌구 저쩌구");

        submitBtn.setText("전송");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inGameBackgroundLayout = new javax.swing.GroupLayout(inGameBackground);
        inGameBackground.setLayout(inGameBackgroundLayout);
        inGameBackgroundLayout.setHorizontalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(explanation)
                    .addComponent(initialWord, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inGameBackgroundLayout.createSequentialGroup()
                .addComponent(jTextField1)
                .addGap(0, 0, 0)
                .addComponent(submitBtn))
        );
        inGameBackgroundLayout.setVerticalGroup(
            inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inGameBackgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(initialWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explanation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addGroup(inGameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InGameFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel explanation;
    private javax.swing.JPanel inGameBackground;
    private javax.swing.JLabel initialWord;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
