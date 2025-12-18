package com.github.sergeybrezhnev.bruce.eckel.chapter.one;

/* 2. из директории java скомпилировать класс
 * javac .\com\github\sergeybrezhnev\bruce\eckel\Exercises.java
 * далее запустить приложение
 * java com.github.sergeybrezhnev.bruce.eckel.Exercises
 */
public class OneAndTwo {

    private int intValue;
    private char charValue;

    public static void main(String[] args) {
        OneAndTwo oneAndTwo = new OneAndTwo();
        oneAndTwo.sout();
    }

    public void sout() {
        System.out.println("intValue: " + intValue + ", charValue: " + charValue);
    }
}
