package com.github.sergeybrezhnev.bruce.eckel.chapter.three;

public class Ten {
    public static void main(String[] args) {
        int a = 10101;
        Integer b = 10100;
        boolean a1 = true;
        boolean a2 = true;
        Integer b1 = 0x16;
        Integer b2 = 0xf;
        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(b1^b2));
        var c = a1 ^ a2;
        System.out.println(~a);
        System.out.println(~b1);
        System.out.println(Integer.toBinaryString(a^b));

        int i = 10;
        System.out.println(Integer.toBinaryString(i));
        int j = 1;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(i>>>j));
        System.out.println(i>>>j);
        System.out.println(Integer.toBinaryString(i>>j));
        System.out.println(Integer.toBinaryString(i<<j));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(1024*1024*1024-1+1024*1024*1024);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
}
