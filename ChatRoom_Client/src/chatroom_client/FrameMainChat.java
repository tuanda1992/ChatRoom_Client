package chatroom_client;

public class FrameMainChat extends javax.swing.JFrame {

    public FrameMainChat( ) {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSend = new javax.swing.JButton();
        btnIcon = new javax.swing.JButton();
        btnBold = new javax.swing.JButton();
        btnUnderline = new javax.swing.JButton();
        btnItali = new javax.swing.JButton();
        jSpinner_TextSize = new javax.swing.JSpinner();
        jComboBoxListFont = new javax.swing.JComboBox();
        btnColor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListUser = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Iput_Message = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane_Message = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel_RoomName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSend.setText("Send");
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });
        btnSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSendKeyPressed(evt);
            }
        });

        btnIcon.setAction(btnIcon.getAction());
        btnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconClientSource/12.gif"))); // NOI18N
        btnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIconMouseClicked(evt);
            }
        });
        btnIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconActionPerformed(evt);
            }
        });

        btnBold.setText("B");
        btnBold.setToolTipText("");
        btnBold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoldMouseClicked(evt);
            }
        });

        btnUnderline.setText("U");
        btnUnderline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnderlineMouseClicked(evt);
            }
        });

        btnItali.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnItali.setText("I");
        btnItali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItaliMouseClicked(evt);
            }
        });

        jComboBoxListFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxListFontItemStateChanged(evt);
            }
        });

        btnColor.setText("Color");
        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jListUser);

        jLabel1.setText("Conversation");

        jLabel2.setText("Friend");

        jTextArea_Iput_Message.setColumns(20);
        jTextArea_Iput_Message.setRows(5);
        jTextArea_Iput_Message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea_Iput_MessageKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_Iput_Message);

        jTextPane_Message.setEditable(false);
        jScrollPane4.setViewportView(jTextPane_Message);

        jLabel_RoomName.setText("Chat Room");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem2.setText("Author");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBold, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnItali, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxListFont, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_TextSize, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_RoomName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_RoomName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUnderline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnItali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxListFont, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner_TextSize))
                            .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconMouseClicked

    }//GEN-LAST:event_btnIconMouseClicked

    private void jComboBoxListFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxListFontItemStateChanged

    }//GEN-LAST:event_jComboBoxListFontItemStateChanged

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked
      
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked

    }//GEN-LAST:event_btnSendMouseClicked

    private void btnIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconActionPerformed
            
    }//GEN-LAST:event_btnIconActionPerformed

    private void btnBoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoldMouseClicked
        
    }//GEN-LAST:event_btnBoldMouseClicked

    private void jTextArea_Iput_MessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_Iput_MessageKeyTyped
             
    }//GEN-LAST:event_jTextArea_Iput_MessageKeyTyped

    private void btnSendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSendKeyPressed

    }//GEN-LAST:event_btnSendKeyPressed

    private void btnUnderlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnderlineMouseClicked

    }//GEN-LAST:event_btnUnderlineMouseClicked

    private void btnItaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItaliMouseClicked

    }//GEN-LAST:event_btnItaliMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMainChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBold;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnIcon;
    private javax.swing.JButton btnItali;
    public javax.swing.JButton btnSend;
    private javax.swing.JButton btnUnderline;
    private javax.swing.JComboBox jComboBoxListFont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_RoomName;
    private javax.swing.JList jListUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner_TextSize;
    private javax.swing.JTextArea jTextArea_Iput_Message;
    private javax.swing.JTextPane jTextPane_Message;
    // End of variables declaration//GEN-END:variables
    
}
