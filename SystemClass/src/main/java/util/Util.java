package util;

public class Util {
    public static void switchPosition(int[] arr, int pos1, int pos2) {
        int pos1Value = arr[pos1];
        int pos2Value = arr[pos2];
        arr[pos1] = pos2Value;
        arr[pos2] = pos1Value;
    }
}
