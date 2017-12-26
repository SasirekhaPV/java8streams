package com.learnshare.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsBasic {

    public static void main(String[] args) {

        convertListOfStringToUpperCase();
    }

    private static void convertListOfStringToUpperCase() {

        List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "banana", "grapes", "watermelon");

        //Before Java 8
        List<String> fruitsInUpperCase = new ArrayList<>();
        System.out.println("Before Java 8 ->");
        for(String fruit : fruits){
            fruitsInUpperCase.add(fruit.toUpperCase());
        }

        System.out.println(fruitsInUpperCase);

        //Using Java8
        List<String> fruitsInUpperCaseJava8 = fruits.stream()
                                                    .map(String::toUpperCase)
                                                    .collect(Collectors.toList());
        System.out.println("Java 8 ->");
        System.out.println(fruitsInUpperCaseJava8);

        //Streams can be used for any type of data
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = numbers.stream()
                                      .map(number -> number * 2)
                                      .collect(Collectors.toList());
        System.out.println("Result = " + result);

    }
}
