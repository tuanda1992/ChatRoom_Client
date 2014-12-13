package chatroom_client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class FrameMainChat extends javax.swing.JFrame implements Runnable {

    public FrameMainChat() {
        initComponents();
    }

    public FrameMainChat(LoginClient MyParent, Socket _socket, String uid, String RoomName) {
        try {
            parent = MyParent;
            socket = _socket;
            UserName = uid;
            ChatRoomName = RoomName;
            initComponents();
            FrameIcon fi = new FrameIcon(this);

            messageArr = new ArrayList();
            privateUserArr = new ArrayList(); //Khởi tạo mảng các cửa sổ chát riêng

            clsClient = new ChatClient_Process(jTextPane_Message, jListUser, messageArr);
            jSpinner_TextSize.setValue(14); //mặc định kích thước chữ là 14

            //Lấy danh sách tất cả các font đã cài trên máy
            clsClient.GetFontList(jComboBoxListFont);
            jComboBoxListFont.setSelectedItem("Arial");
            //////
            ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
            imageBgURL = "file:///" + ImagesDir + "sky.jpg";
            clsClient.SetBackgroundPanel(imageBgURL);

            jLabel_RoomName.setText(ChatRoomName + ":" + " " + UserName + " ");

            Message = "LOGROOM::" + ChatRoomName;
            clsClient.SendMessageToServer(socket, Message);
            System.out.println(Message);
            try {
                in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            } catch (Exception ex) {

            }
            thread = new Thread(this);
            thread.start();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Thông báo lỗi: \n" + ex.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void SendPrivate(String Message) {
        try {
            clsClient.SendMessageToServer(socket, Message);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi: " + ex.getMessage());
        }
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
        jMenu3 = new javax.swing.JMenu();
        jCheckBox_Sky = new javax.swing.JMenuItem();
        jCheckBox_Tree = new javax.swing.JMenuItem();
        jCheckBox_Heart = new javax.swing.JMenuItem();
        jCheckBox_Nice = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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

        btnBold.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jSpinner_TextSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_TextSizeStateChanged(evt);
            }
        });

        jComboBoxListFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxListFontItemStateChanged(evt);
            }
        });

        btnColor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnColor.setForeground(new java.awt.Color(0, 204, 0));
        btnColor.setText("Color");
        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
        });

        jListUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListUserMouseClicked(evt);
            }
        });
        jListUser.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUserValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListUser);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Conversation");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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

        jLabel_RoomName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_RoomName.setText("Chat Room");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem2.setText("Author");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Change Picture");

        jCheckBox_Sky.setText("Sky");
        jCheckBox_Sky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SkyActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Sky);

        jCheckBox_Tree.setText("Tree");
        jCheckBox_Tree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_TreeActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Tree);

        jCheckBox_Heart.setText("Heart");
        jCheckBox_Heart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HeartActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Heart);

        jCheckBox_Nice.setText("Nice");
        jCheckBox_Nice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_NiceActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBox_Nice);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_RoomName)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBold, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnItali, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxListFont, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_TextSize, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_RoomName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUnderline, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnItali, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxListFont, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner_TextSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIconMouseClicked
        Point p = new Point(((int) (btnIcon.getLocationOnScreen().getX() + btnIcon.getWidth())), ((int) (btnIcon.getLocationOnScreen().getY() - fi.getHeight())));
        fi.setLocation(p);
        fi.setDefaultCloseOperation(HIDE_ON_CLOSE);
        fi.show();
    }//GEN-LAST:event_btnIconMouseClicked

    private void jComboBoxListFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxListFontItemStateChanged
        FontName = jComboBoxListFont.getSelectedItem().toString();
        getFontStyle(FontName, Bold, Italic, FontSize);
    }//GEN-LAST:event_jComboBoxListFontItemStateChanged

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked
        Color c = JColorChooser.showDialog(null, "Chọn màu...", Color.MAGENTA);
        ColorName = clsClient.getCodeColor(c.getRed(), c.getGreen(), c.getBlue());
        btnColor.setForeground(c);
        jTextArea_Iput_Message.setForeground(c);
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnSend() {
        try {
            MessageB = new StringBuilder();
            MessageB.append(UserName + " :");
            if (Bold) {
                MessageB.append("<b>");
            }
            if (Under) {
                MessageB.append("<u>");
            }
            if (Italic) {
                MessageB.append("<i>");
            }
            MessageB.append("<font face = \"" + FontName + "\" size=" + FontSize_HTML + " color = \"" + ColorName + "\">");
            MessageB.append("  "); //thêm 2 dấu cách ngăn giữa phần định dạng và phần nội dung
            MessageB.append(jTextArea_Iput_Message.getText());
            MessageB.append("</font>");
            if (Italic) {
                MessageB.append("</i>");
            }
            if (Under) {
                MessageB.append("</u>");
            }
            if (Bold) {
                MessageB.append("</b>");
            }

            Message = clsClient.ProcessMessage(MessageB.toString());
            clsClient.SendMessageToServer(socket, "ROOMCHAT::" + Message);
            clsClient.AddMessageToPanel(Message, imageBgURL);
            jTextArea_Iput_Message.setText("");

            btnSend.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi: " + ex.getMessage());
        }

    }
    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        btnSend();
    }//GEN-LAST:event_btnSendMouseClicked

    private void btnIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconActionPerformed

    }//GEN-LAST:event_btnIconActionPerformed

    private void btnBoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoldMouseClicked
        Bold = btnBold.isSelected();
        getFontStyle(FontName, Bold, Italic, FontSize);
    }//GEN-LAST:event_btnBoldMouseClicked

    private void jTextArea_Iput_MessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_Iput_MessageKeyTyped
        if (jTextArea_Iput_Message.getText().contains("\n")) {
            btnSend();
        }
    }//GEN-LAST:event_jTextArea_Iput_MessageKeyTyped

    private void btnSendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSendKeyPressed
        if (jTextArea_Iput_Message.getText().equals("")) {
            btnSend.setEnabled(false);
        } else {
            btnSend.setEnabled(true);
        }
    }//GEN-LAST:event_btnSendKeyPressed

    private void btnUnderlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnderlineMouseClicked
        Under = btnUnderline.isSelected();
        getFontStyle(FontName, Bold, Italic, FontSize);
    }//GEN-LAST:event_btnUnderlineMouseClicked

    private void btnItaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItaliMouseClicked
        Italic = btnItali.isSelected();
        getFontStyle(FontName, Bold, Italic, FontSize);
    }//GEN-LAST:event_btnItaliMouseClicked

    private void jCheckBox_TreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_TreeActionPerformed
        jCheckBox_Tree.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "Friend.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_TreeActionPerformed

    private void jCheckBox_SkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SkyActionPerformed
        jCheckBox_Sky.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "Sky.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SkyActionPerformed

    private void jCheckBox_NiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_NiceActionPerformed
        jCheckBox_Nice.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "Nice.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_NiceActionPerformed

    private void jCheckBox_HeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HeartActionPerformed
        jCheckBox_Heart.isEnabled();
        ImagesDir = System.getProperty("user.dir") + "\\Images\\Background\\";
        imageBgURL = "file:///" + ImagesDir + "cartoon.jpg";
        clsClient.SetBackgroundPanel(imageBgURL);
    }//GEN-LAST:event_jCheckBox_HeartActionPerformed

    private void jSpinner_TextSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_TextSizeStateChanged
        if (Integer.parseInt(jSpinner_TextSize.getValue().toString()) > 0 && Integer.parseInt(jSpinner_TextSize.getValue().toString()) < 100) {
            FontSize = Integer.parseInt(jSpinner_TextSize.getValue().toString());
        } else {
            jSpinner_TextSize.setValue(12);
        }
        getFontStyle(FontName, Bold, Italic, FontSize);
        FontSize_HTML = (int) (FontSize / 3);
    }//GEN-LAST:event_jSpinner_TextSizeStateChanged
    
    private int ClickCount =1;
    private void jListUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListUserMouseClicked
        
    }//GEN-LAST:event_jListUserMouseClicked

    private void jListUserValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUserValueChanged
        ClickCount =0;
    }//GEN-LAST:event_jListUserValueChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Author author = new Author();
        author.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        author.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        clsClient.SendMessageToServer(socket, "OUTROOM");
           parent.ChangeRoomAble();
    }//GEN-LAST:event_formWindowClosing

    public void getFontStyle(String FontName, Boolean Bold, Boolean Italic, int Size) {
        Font f;
        if (Bold && Italic) {
            f = new Font(FontName, Font.BOLD + Font.ITALIC, Size);
        } else if (Bold) {
            f = new Font(FontName, Font.BOLD, Size);
        } else if (Italic) {
            f = new Font(FontName, Font.ITALIC, Size);
        } else {
            f = new Font(FontName, Font.PLAIN, Size);
        }
        jTextArea_Iput_Message.setFont(f);
    }

    public void setIcon(String icon) {
        jTextArea_Iput_Message.setText(jTextArea_Iput_Message.getText() + icon);
    }

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
    private javax.swing.JMenuItem jCheckBox_Heart;
    private javax.swing.JMenuItem jCheckBox_Nice;
    private javax.swing.JMenuItem jCheckBox_Sky;
    private javax.swing.JMenuItem jCheckBox_Tree;
    private javax.swing.JComboBox jComboBoxListFont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_RoomName;
    private javax.swing.JList jListUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
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

    private ChatClient_Process clsClient;
    private ArrayList messageArr, privateUserArr;
    private String FontName = "Arial", ColorName = "#000000";
    private Boolean Bold = false, Under = false, Italic = false;
    private String imageBgURL, ImagesDir;
    private int FontSize = 14, FontSize_HTML = 4, index1, index2;

    private StringBuilder MessageB;
    private String UserName = "Default", ChatRoomName = "Xì-tai";
    private Socket socket;
    private String Message;
    private Thread thread;

    private FrameIcon fi;
    private DataInputStream in;
    private DataOutputStream out;
    private LoginClient parent;

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
