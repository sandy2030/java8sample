package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo{

    /*

    void accept(T t){

    }*/

    public static void main(String[] args) {
        Consumer<String> consumer=s ->System.out.println("s :: "+s);
        consumer.accept("sandy");

        List<String> list= Arrays.asList("one","two","three","four","five");
        list.stream().forEach(consumer);
    }
}
