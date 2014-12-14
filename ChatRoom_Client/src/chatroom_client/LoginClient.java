
package chatroom_client;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.Socket;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

public class LoginClient extends javax.swing.JFrame implements Setting{
    Connection con;
    Statement st;
    ResultSet rs;

   
    public LoginClient() {
         initComponents();
        
        for(int i=0 ;i< roomList.length; i++)
        {
            comboBox_Room.insertItemAt(roomList[i], i);
            
            
        }
        comboBox_Room.setSelectedIndex(0);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextUser = new javax.swing.JTextField();
        comboBox_Room = new javax.swing.JComboBox();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboBox_Room.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_RoomItemStateChanged(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.setMaximumSize(new java.awt.Dimension(80, 30));
        btnLogin.setMinimumSize(new java.awt.Dimension(80, 30));
        btnLogin.setPreferredSize(null);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelKeyPressed(evt);
            }
        });

        jLabelUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelUser.setText("Username ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Room");

        Password.setText("jPasswordField1");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Password");

        jMenu1.setText("File");

        jMenuItem1.setText("Confingure");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUser)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(9, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password)
                    .addComponent(jTextUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBox_Room, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelUser))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(comboBox_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
         FrameConfingure Fcf = new FrameConfingure();
        
        Fcf.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
      
       ConfigFile =  "Config.ini";
        file = new FilesProcess();
        try
        {
            FileReader read = file.FileRead(ConfigFile);
            BufferedReader reader = new BufferedReader(read);
            String line = reader.readLine();
            while(line != null)
            {
                if(line.startsWith("server"))
                {
                    String str[] = line.trim().split("=");
                    HostName = str[1].trim();
                }
                if(line.startsWith("port"))
                {
                    String str[] = line.trim().split("=");
                    Port = Integer.parseInt(str[1].trim());
                }
                line = reader.readLine();
            }
            
            reader.close();
            read.close();

            if(jTextUser.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập vào NickName!","Thông báo",JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {   
                
                
                    try
                    {
                        try
                        {
                        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
                        Class.forName(driver);
                        String db = "jdbc:odbc:Db1";
                        con = DriverManager.getConnection(db);
                        st = con.createStatement();
                        }
                        catch(Exception e){
                            
                        }
                     
                        UserName = jTextUser.getText().trim();
                        String Pass = Password.getText().trim();
                        String spl = " select user,pass from Database4 where user = '"+UserName+"'and pass = '"+Pass+"'";
                        rs = st.executeQuery(spl);
                        int count =0;
                        while(rs.next()){
                            count++;
                            
                        }
                        if(count==1){
                            JOptionPane.showMessageDialog(null, "alo");
                        }
                    
                    if(First)
                    {
                        
                        socket = new Socket(HostName, Port);
                        out = new DataOutputStream(socket.getOutputStream());
                        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                        str= "HELLO" + "::" + UserName + "--"+ comboBox_Room.getSelectedItem().toString();
                        out.writeUTF(str + "\r\n");
                        ReadString = in.readUTF();
                       
                        str=ReadString;
                        if(ReadString.startsWith("EXIST") == false)
                        {
                            JOptionPane.showMessageDialog(null, str,"Thông báo",JOptionPane.INFORMATION_MESSAGE);
                           
                            
                            btnLogin.setEnabled(false);
                            jTextUser.setEditable(false);
                            jTextUser.setBackground(Color.green);
                             frm = new FrameMainChat(this, socket, UserName, comboBox_Room.getSelectedItem().toString());
                            frm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                           
                            frm.show();
                            First=false;
                            btnCancel.setEnabled(true);
                        }
                        else
                        {
                            Index1 = str.indexOf("::") + 2;
                            JOptionPane.showMessageDialog(null, str.substring(Index1),"Thông báo",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else
                    {
                      
                       btnLogin.setEnabled(false);
                       btnCancel.setEnabled(true);
                        jTextUser.setEditable(false);
                        jTextUser.setBackground(Color.green);
                        frm = new FrameMainChat(this, socket, UserName, comboBox_Room.getSelectedItem().toString());
                       frm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                        frm.setTitle(comboBox_Room.getSelectedItem().toString() );
                        frm.show();

                    }
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Không thể kết nối tới máy chủ!","Thông báo",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Lỗi đọc file cấu hình.\nBạn vui lòng chọn Menu 'Hệ thống', chọn 'Cấu hình cổng' để thiết lập lại thông số." ,"Thông báo",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnLoginMouseClicked

    public void ChangeRoomAble(){
        btnLogin.setEnabled(true);
        btnLogin.setText(" Vào Phòng");
    }
        
    public void Logout(){
         if(socket != null)
        {
            try
            {
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("LOGOUT\r\n");
                JOptionPane.showMessageDialog(null, "Bạn đã đăng xuất khỏi hệ thống!");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Quá trình đăng xuất xảy ra lỗi.\nHệ thống sẽ tự động thoát.","Thông báo",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

        }
        
        
    }
    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

        try
        {

            frm.dispose();
            Logout();
            btnCancel.setEnabled(false);
            btnLogin.setEnabled(true);
            btnLogin.setText("Đăng nhập");
            jTextUser.setEditable(true);
            jTextUser.setBackground(Color.WHITE);
            btnCancel.setEnabled(false);
            First = true;
            socket.close();
            socket = null;
        }
        catch(Exception ex) {}
    }//GEN-LAST:event_btnCancelMouseClicked

    private void comboBox_RoomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_RoomItemStateChanged
              
    }//GEN-LAST:event_comboBox_RoomItemStateChanged

    private void btnCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelKeyPressed
        
    }//GEN-LAST:event_btnCancelKeyPressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
    }//GEN-LAST:event_btnCancelActionPerformed
  private String ChuanHoaChuoi(String str)
    {
        
        while(str.contains("  "))
        {
            str = str.replaceAll("  ", " ");
        }
        return str;
    }

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox comboBox_Room;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
 private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private String UserName,str,ReadString;
    private int Port = 2009;
    private String HostName="Tung";
    private int Index1;
    private Boolean First=true; //cờ xác nhận lần đầu log
    private FrameMainChat frm;
    private String RootDir,ConfigFile;
     private FilesProcess file;
    
}
