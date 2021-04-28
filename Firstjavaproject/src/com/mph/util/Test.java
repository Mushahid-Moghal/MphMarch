/*package com.mph.util;

import java.util.ArrayList;
import java.util.List;
 
abstract class Animal {}
class Dog extends Animal{}
 
public class Test {
    public static void main(String [] args) {
        List<Dog> list = new ArrayList<Dog>();
        list.add(0, new Dog());
        System.out.println(list.size() > 0);
    }
}*/
enum Status {
    PASS, FAIL, PASS;
}
 
public class Test {
    public static void main(String[] args) {
        System.out.println(Status.FAIL);
    }
}