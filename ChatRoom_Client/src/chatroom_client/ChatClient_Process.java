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
     public String ReplaceString(String msg,String strToReplace,int indexOfStr,String strReplace)
    {
         StringBuilder strB=new StringBuilder(msg);
        strB.replace(indexOfStr, indexOfStr + strToReplace.length() , strReplace);
        return strB.toString();
    }
    public String ProcessMessage(String msg)
    {
        index1 = msg.indexOf(":") + 1;
        index2 = msg.indexOf("  ");
        String OpenTags = msg.substring(index1,index2);
        index1 = msg.indexOf("</font>");
        String CloseTage = msg.substring(index1);
        String tempString;

        int index, length;
        StringBuilder strB =new StringBuilder(msg);
        IconIndex =0;
        for(String smileText: arrSmiles)
        {
            length = smileText.length();
            if(msg.toLowerCase().contains(smileText.toLowerCase()))
            {
                while(msg.toLowerCase().contains(smileText.toLowerCase()))
                {
                    tempString = msg.toLowerCase();
                    try
                    {
                    index1 = tempString.indexOf(smileText.toLowerCase());
                    strB = strB.insert(index1, CloseTage);
                    index2 = index1 + CloseTage.length() + smileText.length();
                    strB = strB.insert(index2, OpenTags);
                    
                    index1 = index1 + CloseTage.length();
                    strB = strB.replace(index1, index2, GetIconFromCode(IconIndex));
                    msg = strB.toString();
                    }
                    catch(Exception e)
                    {
                    }
                }
            }
            IconIndex++;
        }
        return strB.toString();
    }
     public String GetIconFromCode(int IconIndex)
    {
            return "<img src = \"" + "file:///" + ImageDir + Integer.toString(IconIndex) + ".gif\" />";
    }
      public void GetFontList(javax.swing.JComboBox cob)
    {

        GraphicsEnvironment gEvn = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fList=gEvn.getAllFonts();
        for(int i=0;i<fList.length;i++)
        {
            try
            {
                cob.insertItemAt(fList[i].getFontName(), i);
            }
            catch(Exception ex){}
        }
    }
       public void SendMessageToServer(Socket socket,String msg)
    {
        try
        {
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(msg + "\r\n");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra:\n" + ex.getMessage());
        }
    }

     JTextPane MessagePane;
    JList UserList;
    ArrayList messageArr;
    StringBuilder strBMsg;
    DataOutputStream out;
    int index1,index2,IconIndex;
    String ImageDir;
}

    

