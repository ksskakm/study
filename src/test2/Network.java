package test2;

import java.net.*;

public class Network {
    public static void main(String[] args) throws Exception{

        InetAddress local=InetAddress.getLocalHost();
        //InetAddress remote=InetAddress.getByName("www.itcast.cn");
        System.out.println("本机IP地址为"+local.getHostAddress());
        //System.out.println("itcast 的 IP 地址：" + remote.getHostAddress());
        System.out.println("成功");
    }
}
