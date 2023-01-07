package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sreekanth");
        list.add("Suffiyan");
        list.add("sagar");

        List<String> list1 = list.stream().filter(p->p.equals("Sreekanth")).collect(Collectors.toList());
        System.out.println(list1);
    }
}