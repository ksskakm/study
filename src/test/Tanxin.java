package test;
import static java.lang.Math.min;

public class Tanxin {
    public static void main(String[] args) {
        int[] values={1,2,5,10,20,50,100};
        int[] counts={3,1,2,1,1,3,5};
        int[] num=change(442,values,counts);
        print(num,values);

    }
    public static int[] change(int money, int[] values, int[] counts) {
                 //result是用来记录需要的各种面值张数
                 int[] result = new int[values.length];

                 for (int i = values.length - 1; i >= 0; i--) {
                         int num = 0;
                         //需要最大面值人民币张数
                         int c = min(money / values[i], counts[i]);
                         //剩下钱数
                         money = money - c * values[i];
                         //将需要最大面值人民币张数存入数组
                         num += c;
                        result[i] = num;
                 }
                 return result;
    }
    public static void print(int[] num,int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (num[i] != 0)
                System.out.println("需要面额为" + values[i] + "的人民币" + num[i] + "张");
        }
    }

}
