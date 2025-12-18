package com.github.sergeybrezhnev.bruce.eckel.chapter.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSeven {
    public static void main(String[] args) {
        InnerClass [] innerClassArray = new InnerClass[10];
        List<InnerClass> innerClassList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            innerClassArray[i] = new InnerClass(i);
            innerClassList.add(innerClassArray[i]);
        }
        List<InnerClass> innerClassSubList = innerClassList.subList(0, 2);
        innerClassList.removeAll(innerClassSubList);
        System.out.println("1: " + innerClassList);
        System.out.println("2: " + Arrays.toString(innerClassArray));
//        Exception in thread "main" java.util.ConcurrentModificationException
//        System.out.println("3: " + innerClassSubList);
//        Т.к. subList ссылается на элементы основного списка и косвенно был изменен, удалив сам себя

        List<InnerClass> innerClassList2 = Arrays.stream(innerClassArray).collect(Collectors.toList());
        List<InnerClass> innerClassSubList2 = innerClassList2.subList(0, 2);
        innerClassSubList2.add(new InnerClass(10));
        System.out.println("4: " + innerClassList2);
        System.out.println("5: " + innerClassSubList2);
        System.out.println("6: " + Arrays.toString(innerClassArray));
    }
}

class InnerClass {
    private Integer value;

    public InnerClass(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "InnerClass{" +
                "value=" + value +
                '}';
    }
}
