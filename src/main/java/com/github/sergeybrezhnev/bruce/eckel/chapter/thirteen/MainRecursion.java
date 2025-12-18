package com.github.sergeybrezhnev.bruce.eckel.chapter.thirteen;

//Хороший пример для оценки знаний по Java
public class MainRecursion {
    public static void main(String[] args) {
        MainRecursion mainRecursion = new MainRecursion();
        System.out.println(mainRecursion);
    }

    @Override
    public String toString() {
        //Exception in thread "main" java.lang.StackOverflowError
        //	at java.base/java.lang.String.valueOf(String.java:4465)
        //	at com.github.sergeybrezhnev.bruce.eckel.chapter.thirteen.MainRecursion.toString(MainRecursion.java:11)
        // т.е. при попытке вызвать this в контексте конкатенации строк, будет вызван метод toString у this, т.е.
        // будет вызван тот же самый метод рекурсивно, что приведет к ошибке
//        return "MainRecursion address: " + this;
        return "MainRecursion address: " + super.toString();
    }
}
