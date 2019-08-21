package test2;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket(InetAddress.getLocalHost(),8888);
        InputStream in=s.getInputStream();
        byte[] buffer= new byte[1024];
        int length=in.read(buffer);
        System.out.println(new String(buffer,0,length));
        in.close();
        s.close();
    }
}
