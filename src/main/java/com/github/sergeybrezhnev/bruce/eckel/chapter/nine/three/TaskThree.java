package com.github.sergeybrezhnev.bruce.eckel.chapter.nine.three;

// Хорошая задача для собеседований
public class TaskThree {
    public static void main(String[] args) {
        //Сначала конструктор ExtendedClass, в нем вызывается конструктор AbstractClass, после конструктора
        // инициализируются переменные
        AbstractClass e = new ExtendedClass();
        e.print();
    }
}
