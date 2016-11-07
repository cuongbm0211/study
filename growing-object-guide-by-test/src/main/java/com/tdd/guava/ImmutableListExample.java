package com.tdd.guava;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuong on 11/3/2016.
 */
public class ImmutableListExample {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Name 1", 1);
        Employee emp2 = new Employee(2, "Name 2", 2);
        Employee emp3 = new Employee(3, "Name 3", 3);
        Employee emp4 = new Employee(4, "Name 4", 4);
        Employee emp5 = new Employee(5, "Name 5", 5);
        Employee emp6 = new Employee(6, "Name 6", 6);
        Employee emp7 = new Employee(7, "Name 7", 7);
        Employee emp8 = new Employee(8, "Name 8", 8);
        Employee emp9 = new Employee(9, "Name 9", 9);

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);
        list.add(emp9);

        // Guava version
        ImmutableList<Employee> unmodifiableList = ImmutableList.copyOf(list);
        Employee emp10 = new Employee(10, "Name 10", 10);
        unmodifiableList.add(emp10);

//        List<Employee> unmodifiableList = Collections.unmodifiableList(list);
        Employee employee = unmodifiableList.get(0);
        employee.setAge(100);

        System.out.println();

    }

}
