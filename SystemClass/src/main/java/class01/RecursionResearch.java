package class01;

public class RecursionResearch {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 3, 6, 7};
        int maxValue = process(arr, 0, arr.length - 1);
        System.out.println(maxValue);
    }

    public static int process(int[] arr, int left, int right) {
        //base case
        if (left == right) {
            return arr[left];
        }
        int middle = (left + right) / 2;
        int leftMax = process(arr, left, middle);
        int rightMax = process(arr, middle + 1, right);
        return Math.max(leftMax, rightMax);
    }
}
