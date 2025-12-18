package com.github.sergeybrezhnev.bruce.eckel.chapter.ten.four;

public class OuterClass {
    //Вложенный класс в классе
    public class InnerClass {

    }

    //Вложенный класс в метод
    public SomeInterface someClass() {
        class ExtendedSomeInterface implements SomeInterface {

        }
        return new ExtendedSomeInterface();
    }

    //Вложенный класс в произвольную область действия
    public void someMethod(boolean booleanValue) {
        if (booleanValue) {
            class InnerClassV2 {

            }
            new InnerClassV2();
        }
//        new InnerClassV2(); // уже вне области видимости
    }
}
