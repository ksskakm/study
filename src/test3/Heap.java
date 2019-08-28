package test3;

import java.util.Arrays;

public class Heap{
    public static void main(String[] args) {
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
        //循环建堆  
        for(int i=0;i<a.length-1;i++){
            //建堆  
            buildMaxHeap(a,a.length-1-i);
            //交换堆顶和最后一个元素,堆顶即a[0]
            swap(a,0,a.length-1-i);
            System.out.println(Arrays.toString(a));
        }
    }
    //对arr数组从0到lastIndex建大顶堆
    public static void buildMaxHeap(int[] arr, int lastIndex){
        //从lastIndex处节点（最后一个节点）的父节点开始 
        for(int i=(lastIndex-1)/2;i>=0;i--){
            //k保存正在判断的节点 
            int k=i;
            //如果当前k节点的子节点存在  
            while(k*2+1<=lastIndex){
                //k节点的左子节点的索引 
                int biggerIndex=2*k+1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if(biggerIndex<lastIndex){
                    //如果右子节点的值较大
                    if(arr[biggerIndex]<arr[biggerIndex+1]){
                        //biggerIndex总是记录较大子节点的索引  
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值  
                if(arr[k]<arr[biggerIndex]){
                    //交换他们  
                    swap(arr,k,biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
                    k=biggerIndex;
                }else{
                    break;
                }
            }
        }
    }
    //交换
    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
