package test2;

import jdk.internal.util.xml.impl.Input;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient2 {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);
        OutputStream out=socket.getOutputStream();
        BufferedInputStream filein =new BufferedInputStream(new FileInputStream("C:\\Users\\hk\\Desktop\\文件\\timg.jpg"));
        int len=-1;
        byte[] buffer=new byte[2048];

        while ((len = filein.read(buffer)) != -1){
        //把数据写到 Socket 的输出流中
            out.write(buffer, 0, len);
        }
        //6,客户端发送数据完毕，结束 Socket 输出流的写入操作，告知服务器端
        socket.shutdownOutput();


        InputStream in=socket.getInputStream();
        byte[] info=new byte[2048];
        int length=in.read(info);
        System.out.println(new String(info,0,length));

        in.close();

        filein.close();
        out.close();
        socket.close();
    }


}
