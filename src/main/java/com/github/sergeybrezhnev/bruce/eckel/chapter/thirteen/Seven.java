package com.github.sergeybrezhnev.bruce.eckel.chapter.thirteen;

import java.util.regex.Pattern;

//Предложение начинается с прописной буквы и завершается точкой.
public class Seven {
    public static void main(String[] args) {
        Pattern regex = Pattern.compile("^[А-Я].*\\.$");
        System.out.println("result 1: " + regex.matcher("Я люблю булочку с маком.").matches());
        System.out.println("result 2: " + regex.matcher("Я люблю булочку с маком").matches());
        System.out.println("result 3: " + regex.matcher("я люблю булочку с маком.").matches());
        System.out.println("result 4: " + regex.matcher("я люблю булочку с маком").matches());
        System.out.println("result 5: " + regex.matcher("может Я люблю булочку с маком. сладкую.").matches());
    }
}
