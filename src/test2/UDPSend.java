package test2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static void main(String[] args) throws Exception{
        DatagramSocket sendSocket =new DatagramSocket();
        byte[] buffer="Hello,UDP".getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 12306);
        sendSocket.send(dp);
        sendSocket.close();
        System.out.println("发送完成");

    }
}
