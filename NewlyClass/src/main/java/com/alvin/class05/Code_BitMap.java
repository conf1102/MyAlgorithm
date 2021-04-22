package com.alvin.class05;

public class Code_BitMap {

    private long[] bits;

    public Code_BitMap(int max) {
        bits = new long[(max = 64) >> 6];
    }

    public static void main(String[] args) {
        //1.右移6位就是除64
//        int num = 64;
//        print(num);
//        print(num >> 6);
        //2.num%64 == num & 63
        //因为取模运算就是把大头的干掉，返回剩下的余数，而&63的操作一样，&63的话也是把大头干掉，因为63转换为2进制数的话
        //为00000000000000000000000000111111，前面都是0
        System.out.println(127%64);
        print(63);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
