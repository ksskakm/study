package test;

public class EmpressP {

    public static void main(String[] args) {
        Empress a=new Empress();
        a.find(0);
        System.out.println("八皇后问题共有："+a.map+"种可能");

    }
}

class Empress{

    public  int[][] arry = new int[8][8];   //二维数组做棋盘

    public  int map=0;                      //解法数量

    public  boolean rule(int arry[][],int k,int j){ //判断节点是否合适
        for(int i=0;i<8;i++){                       //行列冲突
            if (arry[i][j]==1){
                return false;
            }
        }

        for(int i=k-1,m=j-1;i>=0&&m>=0;i--,m--){    //左对角线
            if (arry[i][m]==1)
                return false;
        }

        for(int i=k-1,m=j+1;i>=0&&m<=7;i--,m++){    //右对角线
            if (arry[i][m]==1)
                return false;
        }
        return true;
    }

    public void find(int i){
        if(i>7){
            map++;                  //找到一种新解法
            print();
            return;
        }
        for(int m=0;m<8;m++){       //深度优先,递归算法
            if(rule(arry,i,m)){
                arry[i][m]=1;
                find(i+1);
                arry[i][m]=0;       //在这个算法中，使用8X8数组来表示棋盘，元素赋值1代表存在一个皇后，0表示无。
                                    //主要是要注意回溯过程中已舍弃的皇后代表的数组元素要置0，以免接下来继续使用深度优先搜索时，
                                    //用判断规则public boolean rule(int arry[][],int k,int j){}出现判断错误。
            }
        }
    }

    public void print() {      //打印方法结果
        System.out.print("方案" + map + ":\n");
        for (int i = 0; i < 8; i++) {
            for (int m = 0; m < 8; m++) {
//                if (arry[i][m] == 1) {
//                    System.out.print("皇后" + (i + 1) + "在第" + i + "行，第" + m + "列\t");
//
//                }
                System.out.printf("%d ",arry[i][m]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
