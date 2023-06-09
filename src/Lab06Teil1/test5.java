package Lab06Teil1;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int[]arr = {1,2,23,4,4,5,6,64,};
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
