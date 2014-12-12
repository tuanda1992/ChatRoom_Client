
package chatroom_client;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Chat_With.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Chat_With.setText("Private Chat");

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Chat_With, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnBold, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnItalic, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_List, 0, 147, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(jSpinnerText_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Chat_With, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBold)
                    .addComponent(btnUnderline)
                    .addComponent(btnItalic)
                    .addComponent(jComboBox_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerText_Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextArea_Input_MessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_Input_MessageKeyTyped
      
    }//GEN-LAST:event_jTextArea_Input_MessageKeyTyped

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBold;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnItalic;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnUnderline;
    private javax.swing.JComboBox jComboBox_List;
    private javax.swing.JLabel jLabel_Chat_With;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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