package com.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


public class Practice {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 14, 5, 6, 17, 8, 9,2,6,17);
        List<Employee> list=null;
        try {
            list=employees();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 1

      ///  intList.stream().filter(x -> x % 2 == 0).forEach(System.out::print);

        //2

        List<Integer> collect = intList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
       // collect.forEach(s-> System.out.println("->"+s));

        // 3
       // intList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s-> System.out.println(s));

        HashSet<Integer> set=new HashSet<>();

        //intList.stream().filter(s->!set.add(s)).forEach(s-> System.out.print("-> " + s));

        //4
        //intList.stream().findFirst().ifPresent(s-> System.out.println(s));


       // System.out.println(intList.stream().count());


        System.out.println(intList.stream().max(Integer::compare).get());
        EmployeeComparator<String> ec=new EmployeeComparator<>("dob");
        Practice p=new Practice();
        List<Employee> lists=null;
        try {
            lists=employees();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Collections.sort(lists,new EmployeeComparator("salary"));
        lists.stream().forEach(s-> System.out.println(s+","));

    }


    static List<Employee> employees() throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return Arrays.asList(new Employee("1","IT","Sam",new Address("122","C","ISB","123456"),1000,sdf.parse("19/06/1980")),
        new Employee("2","IT","Pet",new Address("333","C","ISB","124589"),1700,sdf.parse("11/12/1988")),
                new Employee("3","IT","Jimmy",new Address("785","E","Kent","123456"),4100,sdf.parse("22/02/1974")),
                new Employee("10","ADMIN","Jil",new Address("778","C","DC Road","451263"),8100,sdf.parse("01/10/1969"))
        );
    }
}
