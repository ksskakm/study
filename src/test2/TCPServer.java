package test2;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(8888);
        Socket s=ss.accept();
        InetAddress ipobject=s.getInetAddress();
        String ip=ipobject.getHostAddress();
        OutputStream out=s.getOutputStream();
        out.write((ip+"连接上了服务器!辣是真滴流批！").getBytes());
        out.close();
        s.close();
        System.out.println("开启成功");

    }

}
