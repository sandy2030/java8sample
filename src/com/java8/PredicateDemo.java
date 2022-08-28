package com.java8;

import java.util.function.Predicate;

/**
 * Created by sande on 21-06-2022.
 */
public class PredicateDemo {
   /*

   public boolean test(T t){

    }*/

    public static void main(String[] args) {

        Predicate<Integer> predicate=t->t%2==0;

        System.out.println(predicate.test(81));

    }

}
