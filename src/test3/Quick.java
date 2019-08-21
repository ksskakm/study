package test3;

public class Quick {
    public static void quicksort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high) {
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp=arr[low];
        while(i<j){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quicksort(arr,low,j-1);
        quicksort(arr,j+1,high);
    }


    public static void main(String[] args) {
        int[] arr={10,7,2,14,7,62,3,4,2,1,8,9,19};
        System.out.println("开始排序");
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("排序完成");
    }

}
