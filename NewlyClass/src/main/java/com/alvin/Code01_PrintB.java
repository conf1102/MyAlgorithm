package com.alvin;

public class Code01_PrintB {
    public static void main(String[] args) {
//        int num = 4;
//        //整形32位，long为64位
//        print(num);
//        int test = 4;
//        print(test);
//        print(test<<1);
//        print(test<<2);
//        print(test<<8);
//        int a = 4;
//        //取反
//        print(~a);

        int a = Integer.MIN_VALUE;
        print(a);
        //带符号右移
        print(a >> 1);
        //不带符号右移
        print(a >>> 1);

    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
