package class01;

import util.Util;

public class SelectSort {

    //将一个无序数组排序，算法如下
    //在 0 ... N-1 遍历寻找最小值，找到并且和 0 位置的数互换位置
    //在 1 ... N-1 遍历寻找最小值，找到并且和 1 位置的数互换位置
    //在 2 ... N-1 遍历寻找最小值，找到并且和 2 位置的数互换位置

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            Util.switchPosition(arr, i, minIndex);
        }


    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2, 8, 9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
