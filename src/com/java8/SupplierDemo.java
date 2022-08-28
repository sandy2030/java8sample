package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created by sande on 21-06-2022.
 */
public class SupplierDemo {

    //void get()

    public static void main(String[] args) {
       /* Supplier<Integer> supplier=()->0;

       // System.out.println(supplier.get());

        List<Integer> list= Arrays.asList(1,2,3,4,107);

        System.out.println(list.stream().filter(x->x%10==0).findAny().orElseGet(supplier));*/

        Supplier<String> supplier1=()->"not exists";

        List<String> list1=Arrays.asList("b","c","d");


        System.out.println(list1.stream().filter(x->x.startsWith("a")).findAny().orElseGet(supplier1));
    }

}
