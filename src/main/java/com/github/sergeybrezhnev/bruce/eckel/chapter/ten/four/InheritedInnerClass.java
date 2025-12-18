package com.github.sergeybrezhnev.bruce.eckel.chapter.ten.four;

//Кому-то это нужно?
class InnerClass {
    class InnerInnerClass {

    }
}

public class InheritedInnerClass extends InnerClass.InnerInnerClass {
    InheritedInnerClass(InnerClass innerClass) {
        innerClass.super();
    }
}
