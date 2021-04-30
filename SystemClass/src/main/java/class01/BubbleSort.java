package class01;

import util.Util;

public class BubbleSort {


    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Util.switchPosition(arr, j, j + 1);
                }
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 4, 6, 2, 8};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
