package com.github.sergeybrezhnev.bruce.eckel.chapter.twelve;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {
            e.fillInStackTrace();
        }

        //String.intern() example
        String s1 = new String("hello"); // объект в heap, не в пуле
        String s2 = "hello";             // литерал — автоматически в пуле
        String s3 = s1.intern();        // добавляет "hello" в пул (если ещё не там) и возвращает ссылку на пул

        System.out.println(s1 == s2); // false — разные объекты
        System.out.println(s2 == s3); // true — обе ссылаются на один объект в пуле
        System.out.println(s1.equals(s2)); // true — содержимое одинаково
    }
}

class Parent {
    public Parent() throws IOException {

    }
}

class Child extends Parent {
    public Child() throws IOException {
//        try {
//        конструктор should be on the top level
//            super();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}