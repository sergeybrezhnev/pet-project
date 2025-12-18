package com.github.sergeybrezhnev.bruce.eckel.chapter.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {

    public static class Storage {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        public Storage() throws IOException {
            s = br.readLine();
        }


        int storage(String s) {
            return s.length() * 2;
        }

        void print() {
            System.out.println("storage = " + storage(s) +" " + "byte");
        }

        public static void main(String[] args) throws IOException {
            System.out.println("brah");
            Storage st = new Storage();
            st.print();
        }

    }

}
