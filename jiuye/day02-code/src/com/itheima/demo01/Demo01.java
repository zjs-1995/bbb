package com.itheima.demo01;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add(2,"123");
        System.out.println(list);

        list.set(2,"heima");
        System.out.println(list);
    }
}
