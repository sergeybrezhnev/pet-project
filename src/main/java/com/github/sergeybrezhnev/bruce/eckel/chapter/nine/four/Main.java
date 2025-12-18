package com.github.sergeybrezhnev.bruce.eckel.chapter.nine.four;

public class Main {
    public static AbstractClass getAbstractClass() {
        return new ExtendedClass();
    }

    public static void main(String[] args) {
        ExtendedClass extendedClass = (ExtendedClass) getAbstractClass();
        extendedClass.print();

        AbstractClass abstractClass = getAbstractClass();
        abstractClass.printV2();
    }
}
