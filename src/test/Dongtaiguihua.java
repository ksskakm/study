package test;

import static java.lang.Math.min;

public class Dongtaiguihua {
    public int dongtai(int a){
        if(a==1||a==5)
            return 1;
        if(a>0)
            return  min(dongtai(a-1),dongtai(a-5))+1;
        else
            return 100;
    }
    public static void main(String[] args) {
        int a=81;
        Dongtaiguihua tanxin=new Dongtaiguihua();
        System.out.println("需要"+tanxin.dongtai(a)+"张RMB");

    }
}
