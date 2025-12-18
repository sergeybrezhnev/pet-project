package com.github.sergeybrezhnev.bruce.eckel.chapter.four;

public class Test {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + " j=" + j);
                continue label;
            }
        }
    }
}
