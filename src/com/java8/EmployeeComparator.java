package com.java8;

import java.util.Comparator;

public class EmployeeComparator<T>  implements Comparator<Employee>{
    String T;

    public EmployeeComparator(String t) {
        T = t;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if(T.equals("dob")){
           return o1.getDob().compareTo(o2.getDob());
        }
        if(T.equals("salary")){
          return  o1.getSalary().compareTo(o2.getSalary());
        }

        return 0;
    }


}
