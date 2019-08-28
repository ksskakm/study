package test3;

public class Bubble {

    public static void main(String[] args) {
        int[] arr={10,7,2,4,7,62,3,4,21,1,8,9,19};
        System.out.println("test");
        bubblesort(arr);
        System.out.println("testtest");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubblesort(int[] arr){
        int i,j,t=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

}
