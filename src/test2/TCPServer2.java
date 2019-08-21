package test2;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        System.out.println("开启成功");
        Socket clientsocket=ss.accept();
        InetAddress ipobject=clientsocket.getInetAddress();
        String ip=ipobject.getHostAddress();
        System.out.println("ip "+ip+"已连接上");
        InputStream in=clientsocket.getInputStream();
        BufferedOutputStream fileout=new BufferedOutputStream(new FileOutputStream("D:\\tcptest.jpg"));
        byte[] buffer=new byte[2048];
        int len=-1;
        while((len = in.read(buffer)) != -1){
            //写入目的地的字节输出流中
            fileout.write(buffer, 0, len);

        }
        OutputStream out=clientsocket.getOutputStream();
        out.write("图片上传成功".getBytes());
        out.close();
        fileout.close();
        in.close();
        clientsocket.close();

    }
}
