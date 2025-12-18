package com.github.sergeybrezhnev.bruce.eckel.chapter.eleven;

import java.util.LinkedList;

//Стеки часто используются для вычисления выражений в языках программирования. Используя реализацию,
// net.mindview.util.Stack, вычислите результат следующего выражения, в котором "+" означает "занести следующую букву в
// стек", а "-" - "извлечь верхний элемент стека и вывести его"
public class TaskFifteen {

    public static String EXPRESSION = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

    public static void main(String[] args) {
        char[] charArray = EXPRESSION.toCharArray();
        // implements Dequeue, Dequeue extends Queue
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            switch (c) {
                case '+': {
                    list.push(charArray[i+1]);
                    i++;
                } break;
                case '-':
                    System.out.print(list.pop());
//                    System.out.print(list.poll());
                    break;
                default:
                    break;
            }
        }
    }
}
