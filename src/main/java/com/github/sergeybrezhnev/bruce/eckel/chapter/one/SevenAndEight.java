package com.github.sergeybrezhnev.bruce.eckel.chapter.one;

public class SevenAndEight {

    static class StaticTest {
        static int i = 47;
    }

    static class Incremental {
        static void increment() {
            StaticTest.i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incremental incremental = new Incremental();
        incremental.increment();
        System.out.println(StaticTest.i);
        Incremental.increment();
        System.out.println(StaticTest.i);

        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.i);

        StaticTest staticTest2 = new StaticTest();
        System.out.println(staticTest2.i);

        staticTest2.i++;
        System.out.println(staticTest.i);
    }
}
