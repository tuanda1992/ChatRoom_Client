
package chatroom_client;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class FramePrivateChat extends javax.swing.JFrame {
    
    public FramePrivateChat() {
        initComponents();
    }
    public FramePrivateChat(FrameMainChat _parent, String uid,String UidToChat) {

        UserName = uid;
        UserNameToChat = UidToChat;
        parent = _parent; //form me
        initComponents();

        this.setTitle(UserName +  " -|- " + UserNameToChat + " :: Chat Application ");
        //Bạn đang chát với
        jLabel_Chat_With.setText("Bạn đang trò chuyện với " + UserNameToChat);
        
        
        messageArr = new ArrayList(); //khởi tạo mảng tin gửi
        
        clsClient = new ChatClient_Process(jTextPane_Message, null, messageArr);
        jSpinnerText_Size.setValue(14);

        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "sky.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
        //Lấy danh sách tất cả các font đã cài trên máy
        clsClient.GetFontList(jComboBox_List);
        jComboBox_List.setSelectedItem("Arial");
        dlg = new FrameIcon(parent);
        dlg.setDefaultCloseOperation(HIDE_ON_CLOSE); //thiết lập thuộc tính ẩn khi nhấn nút close
    }


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel_Chat_With = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_Message = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Input_Message = new javax.swing.JTextArea();
        btnBold = new javax.swing.JButton();
        btnUnderline = new javax.swing.JButton();
        btnItalic = new javax.swing.JButton();
        jComboBox_List = new javax.swing.JComboBox();
        jSpinnerText_Size = new javax.swing.JSpinner();
        btnColor = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBox_Cartoon = new javax.swing.JMenuItem();
        jCheckBox_sky = new javax.swing.JMenuItem();
        jCheckBox_tree = new javax.swing.JMenuItem();
        jCheckBox_Heart = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Chat_With.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Chat_With.setText("Private Chat");

        jTextPane_Message.setEditable(false);
        jScrollPane1.setViewportView(jTextPane_Message);

        jTextArea_Input_Message.setColumns(20);
        jTextArea_Input_Message.setRows(5);
        jTextArea_Input_Message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea_Input_MessageKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea_Input_Message);

        btnBold.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        btnBold.setText("B");

        btnUnderline.setText("U");

        btnItalic.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btnItalic.setText("I");
        btnItalic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItalicMouseClicked(evt);
            }
        });

        btnColor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnColor.setForeground(new java.awt.Color(51, 204, 0));
        btnColor.setText("Color");
        btnColor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnColorStateChanged(evt);
            }
        });
        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem1.setText("Author");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Change Picture");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jCheckBox_Cartoon.setText("Cartoon");
        jCheckBox_Cartoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CartoonActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Cartoon);

        jCheckBox_sky.setText("Sky");
        jCheckBox_sky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_skyActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_sky);

        jCheckBox_tree.setText("Left");
        jCheckBox_tree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_treeActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_tree);

        jCheckBox_Heart.setText("Heart");
        jCheckBox_Heart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HeartActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Heart);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBold, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnItalic, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_List, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerText_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnColor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 476, Short.MAX_VALUE)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Chat_With, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Chat_With, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBold)
                    .addComponent(btnUnderline)
                    .addComponent(btnItalic)
                    .addComponent(jComboBox_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerText_Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void getFontStyle(String FontName,Boolean Bold,Boolean Italic, int Size)
    {
        Font f;
        if(Bold && Italic)
            f = new Font(FontName, Font.BOLD + Font.ITALIC, Size);
        else
        if(Bold)
            f = new Font(FontName, Font.BOLD, Size);
        else
        if(Italic)
            f = new Font(FontName, Font.ITALIC, Size);
        else
            f=new Font(FontName, Font.PLAIN, Size);
        jTextArea_Input_Message.setFont(f);
    }
public void setSmile(String smile)
    {
        jTextArea_Input_Message.setText(jTextArea_Input_Message.getText() + smile);
    }
  public String getUsernameToChat()
    {
        return UserNameToChat;
    }

    public void GetMessageAndAddToPanel(String Message)
    {
        clsClient.AddMessageToPanel(Message,imageBgURL);
    }
    private void btnItalicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItalicMouseClicked

        Italic = btnItalic.isSelected();
        getFontStyle(FontName, Bold, Italic, FontSize);
    }//GEN-LAST:event_btnItalicMouseClicked

    private void btnColorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnColorStateChanged
       
    }//GEN-LAST:event_btnColorStateChanged

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked

        Color c = JColorChooser.showDialog(null, "Chọn màu...", Color.MAGENTA);
        ColorName  = clsClient.getCodeColor(c.getRed(), c.getGreen(), c.getBlue());
        btnColor.setForeground(c);
        jTextArea_Input_Message.setForeground(c);  
        
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
         btnSendMessage();
      
    }//GEN-LAST:event_btnSendMouseClicked

    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Author author = new Author();
        author.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        author.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextArea_Input_MessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_Input_MessageKeyTyped
       if(jTextArea_Input_Message.getText().contains("\n")){
            btnSendMessage();
        }
    }//GEN-LAST:event_jTextArea_Input_MessageKeyTyped

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jCheckBox_CartoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CartoonActionPerformed
       jCheckBox_Cartoon.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "cartoon.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_CartoonActionPerformed

    private void jCheckBox_skyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_skyActionPerformed
      jCheckBox_Cartoon.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "sky.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
        
    }//GEN-LAST:event_jCheckBox_skyActionPerformed

    private void jCheckBox_treeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_treeActionPerformed
        jCheckBox_Cartoon.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "Left.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_treeActionPerformed

    private void jCheckBox_HeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HeartActionPerformed
          jCheckBox_Cartoon.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "Nice.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_HeartActionPerformed

    public void btnSendMessage() {
        try
        {
            //test su dung textPane  de hien thi HTML
            MessageB = new StringBuilder();
            MessageB.append(UserName + " :");
            //Chèn định dạng chữ nếu có
            if(Bold)
                MessageB.append("<b>");
            if(Under)
                MessageB.append("<u>");
            if(Italic)
                MessageB.append("<i>");
            MessageB.append("<font face = \"" + FontName + "\" size=" + FontSize_HTML + " color = \"" + ColorName + "\">");
            MessageB.append("  ");
            MessageB.append(jTextArea_Input_Message.getText());
            MessageB.append("</font>");
            if(Italic)
                MessageB.append("</i>");
            if(Under)
                MessageB.append("</u>");
            if(Bold)
                MessageB.append("</b>");
            Message = clsClient.ProcessMessage(MessageB.toString());
            clsClient.AddMessageToPanel(Message,imageBgURL);
            jTextArea_Input_Message.setText("");
            parent.SendPrivate("PRIVATE::" + UserNameToChat + "--" + Message);
            btnSend.setEnabled(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Có lỗi: " + ex.getMessage());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrivateChat().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBold;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnItalic;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnUnderline;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jCheckBox_Cartoon;
    private javax.swing.JMenuItem jCheckBox_Heart;
    private javax.swing.JMenuItem jCheckBox_sky;
    private javax.swing.JMenuItem jCheckBox_tree;
    private javax.swing.JComboBox jComboBox_List;
    private javax.swing.JLabel jLabel_Chat_With;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerText_Size;
    private javax.swing.JTextArea jTextArea_Input_Message;
    private javax.swing.JTextPane jTextPane_Message;
    // End of variables declaration//GEN-END:variables

     private FrameIcon dlg;
    private ChatClient_Process clsClient;
    private ArrayList messageArr;
    private String FontName = "Arial",ColorName="#000000";
    private Boolean Bold = false,Under=false,Italic=false;
    private String imageBgURL,ImagesDir;
    private int FontSize = 14,FontSize_HTML = 4,index1, index2;
    private StringBuilder MessageB;
    private String UserName="Default",ChatRoomName="Phòng Đồ Họa";
    private Boolean sendFlag=false; //cờ cho phép đưa dữ liệu lên panel -
    private String readString,Message;
    private Thread thread;
    private String UserNameToChat;
    private FrameMainChat parent;
}