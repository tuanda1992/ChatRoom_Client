package chatroom_client;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;


public class ChatClient_Process implements Setting,Runnable {
    
    public ChatClient_Process(javax.swing.JTextPane mPane,javax.swing.JList mList,ArrayList mArr)
    {

    }
    
Thread thread;
public void run(){

}
public void AddMessageToPanel(String msg,String bgImageURL) {
        
        messageArr.add(msg);
        strBMsg = new StringBuilder("<html><head></head><body background = \"" + bgImageURL +"\">");
        
        for(Object str: messageArr)
        {
            strBMsg.append(str.toString() + "<br/>");
        }
        strBMsg.append("</body></html>");
        MessagePane.setText(strBMsg.toString());
    }

    public void SetBackgroundPanel(String bgImageURL)
    {
      
        strBMsg = new StringBuilder("<html><head></head><body background = \"" + bgImageURL + "\">");
        for(Object str: messageArr)
        {
            
            strBMsg.append(str.toString() + "<br/>");
            
        }
        strBMsg.append("</body></html>");
        MessagePane.setText(strBMsg.toString());
        
    }
     JTextPane MessagePane;
    JList UserList;
    ArrayList messageArr;
    StringBuilder strBMsg;
    DataOutputStream out;
    int index1,index2,IconIndex;
    String ImageDir;
}

    

