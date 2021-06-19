package util;

public class Util {
    public static void switchPosition(int[] arr, int pos1, int pos2) {
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    //排序对数器
    public static int[] generateRandomTestArr(int length, int maxValue) {
        //Math.random() [0,1)
        //Math.random() * N  [0,N)
        //(int)(Math.random() * N)  [0, N-1]
        int[] intArr = new int[(int)(Math.random() * length)];
        for (int i = 0; i < intArr.length; i++) {
//            包含负值的随机数
//            int randomValue = (int) ((Math.random()) * maxValue) + (int) ((Math.random() - 1) * maxValue);
            int randomValue = (int) ((Math.random()) * maxValue);
            intArr[i] = randomValue;
        }
        return intArr;
    }

    public static int[] copyArr(int[] passInArr) {
        int[] rtnArr = new int[passInArr.length];
        for (int i = 0; i < passInArr.length; i++) {
            rtnArr[i] = passInArr[i];
        }
        return rtnArr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomTestArr(20, 100);
        System.out.println(arr);
    }
}
