package test3;
import org.junit.Test;

public class Merge {
    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        //右移一位，相当于除以2取整
        //int mid = L + (R - L) / 2;
        int mid = L + ((R - L) >> 1);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 22, 14, 7, 62, 3, 4, 2, 1, 8, 9, 191};
        System.out.printf("%d\n", arr.length);
        System.out.println("开始排序");
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("排序完成");
    }

//    public static void mergeSort(int[] arr) {
//        sort(arr, 0, arr.length - 1);
//    }

}
