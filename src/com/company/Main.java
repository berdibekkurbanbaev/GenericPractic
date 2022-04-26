package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1,3,5,5,7,9,2,3,4,6};
        GenericNum<Integer,String>genericNum = new GenericNum<>(3,"hello");
        System.out.println(genericNum);
        System.out.println(genericNum.maxMethod(array));

    }
}
