package netcode;

import java.net.*;
import java.io.*;

public class MasterNode extends Thread
{
    private Socket clientSocket;

    public MasterNode(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
        
    }

    public void run()
    {
        try{
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

            while(true)
            {
                
                Object rec = in.readObject();
                if (rec instanceof DeltaMessage)	{
                    System.out.println((DeltaMessage) rec);
                }

            
    
            }		
        }
        catch(SocketTimeoutException s) {
            System.out.println("Socket timed out!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
