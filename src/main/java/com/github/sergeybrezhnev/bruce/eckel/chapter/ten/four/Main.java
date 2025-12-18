package com.github.sergeybrezhnev.bruce.eckel.chapter.ten.four;

//очередной прикольный пример на знание Java
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }
}
