package class01;

import util.Util;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        // 0 - 0 范围上有序
        // 0 - 1 范围上有序，
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] <= arr[j]) {
                    Util.switchPosition(arr, j + 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 10000;
        int length = 500;
        int maxValue = 100;
        for (int i = 0; i < testTime; i++) {
            int[] arr = Util.generateRandomTestArr(length, maxValue);
            int[] ootbArr = Util.copyArr(arr);
            sort(arr);
            Arrays.sort(ootbArr);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != ootbArr[j]) {
                    System.out.println("Error Happened");
                }
            }
        }
        System.out.println("Good!!");

    }
}
