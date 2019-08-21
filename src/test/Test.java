package test;

import java.io.*;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws IOException{
        File file = new File("c:\\file.txt");
// 创建一个字节输入流对象,必须明确数据源，其实就是创建字节读取流和数据源相关联。
        FileInputStream fis = new FileInputStream(file);
//创建一个字节数组。
        byte[] buf = new byte[1024];//长度可以定义成 1024 的整数倍。
        int len = 0;
        while((len=fis.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fis.close();

    }
    }
