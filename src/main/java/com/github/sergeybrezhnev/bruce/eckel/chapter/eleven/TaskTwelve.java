package com.github.sergeybrezhnev.bruce.eckel.chapter.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Создайте и заполните контейнер List<Integer>. Создайте второй контейнер List<Integer> того же размера. Используйте
//итераторы ListIterator для чтения элементов из первого контейнера List и вставки их во второй контейнер в обратном
//порядке.
public class TaskTwelve {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("1: " + integerList1);

        List<Integer> integerList2 = new ArrayList<>(integerList1.size());

        ListIterator<Integer> listIterator1 = integerList1.listIterator();
        ListIterator<Integer> listIterator2 = integerList2.listIterator();
        while (listIterator1.hasNext()) {
            Integer integer = listIterator1.next();
        }

        while (listIterator1.hasPrevious()) {
            listIterator2.add(listIterator1.previous());
        }

        System.out.println("2: " + integerList2);
    }
}
