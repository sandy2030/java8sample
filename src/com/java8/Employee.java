package com.java8;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee {
    private String empId;
    private String dept;
    private String name;
    private Address address;
    private Integer salary;
    private Date dob;

    public Employee(String empId, String dept, String name, Address address, Integer salary,Date dob) {
        this.empId = empId;
        this.dept = dept;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.dob=dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String result="";
           result = "Employee{" +
                    "empId='" + empId + '\'' +
                    ", dept='" + dept + '\'' +
                    ", name='" + name + '\'' +
                    ", address=" + address +
                    ", salary=" + salary +
                    ", dob=" + sdf.format(dob) +
                    '}';

        return result;
    }
}
