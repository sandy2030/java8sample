package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    /*
    *   Function<T,R>{
    *       R apply(T t);
    *   }
    *
    */

    public static void main(String[] args) {
        Function<String,Integer> func_lembda=x->x.length();

        Function<String,Integer> func_mr=String::length;

        System.out.println(func_lembda.apply("sandeep"));
        System.out.println(func_mr.apply("sandeep"));

        // chain function
        Function<Integer,Integer> then = x ->x * 2;
        System.out.println(func_lembda.andThen(then).apply("1234"));

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");


        memberNames.stream().forEach(System.out::println);
        memberNames.stream().forEach(System.out::println);

    }
}