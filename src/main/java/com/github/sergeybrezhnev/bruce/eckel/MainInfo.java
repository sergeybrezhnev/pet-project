package com.github.sergeybrezhnev.bruce.eckel;

//https://github.com/przemyslawmoskal/Thinking-in-Java-Solutions
public class MainInfo {

    Integer value = 1;

    public MainInfo() {
        System.out.println(this.value);
        this.value = 2;
    }

    // массив примитивов является (ссылочным) объектом
    public void test() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        System.out.println(array.equals(array2));
        System.out.println(array == array2);
        System.out.println(array.getClass().getSimpleName());
    }

    // конструктор неявно является статическим методом
    public static void main(String... args) {
        MainInfo mainInfo = new MainInfo();
        System.out.println(mainInfo.value);
    }

    //TODO "множественное наследование". Есть абстрактный класс А, абстрактный класс B, реализуйте класс С, который
    // использует класс A и B

}
