package com.github.sergeybrezhnev.bruce.eckel.chapter.three;

import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        Random random = new Random();
        int sideOfCoin = random.nextInt(2);
        if (sideOfCoin == 0) {
            System.out.println("It is a heads");
        } else {
            System.out.println("It is a tails");
        }
    }
}
