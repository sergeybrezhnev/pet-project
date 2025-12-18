package com.github.sergeybrezhnev.bruce.eckel.chapter.nine.four;

public class ExtendedClass extends AbstractClass {

    public void print() {
        System.out.println("ExtendedClass print");
    }

    @Override
    public void printV2() {
        System.out.println("ExtendedClass printV2");
    }
}
