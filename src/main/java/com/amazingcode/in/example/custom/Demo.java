package com.amazingcode.in.example.custom;

public class Demo {
    public static void main(String []args){
        CustomArrayList arrayList = new CustomArrayList<>();

        arrayList.add(10);
        arrayList.add("Vaibhav");
        arrayList.add("10000.00");

        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
    }
}
