
package chatroom_client;

import java.io.FileWriter;
import java.io.FileReader;

public class FilesProcess {
    public FileWriter FileCreate(String url) throws Exception
    {
        FileWriter fw= new FileWriter(url);
        return fw;
    }
    
    public FileReader FileRead(String url) throws Exception
    {
        FileReader fr = new FileReader(url);
        return fr;
    }
           
}

