package com.github.sergeybrezhnev.bruce.eckel.chapter.nine.three;

public class ExtendedClass extends AbstractClass {
    int intValue = 2025;

    public ExtendedClass() {
        super();
        this.print();
        this.intValue = 2024;
    }

    @Override
    public void print() {
        System.out.println(intValue);
    }
}
