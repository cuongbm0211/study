package com.tdd.guava;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by cuong on 11/3/2016.
 */
public class CacheExample {
    public static void main(String[] args) throws InterruptedException {
        LoadingCache<String, Employee> employeeCache =
                CacheBuilder.newBuilder()
                        .maximumSize(4)
//                        .expireAfterAccess(5, TimeUnit.SECONDS)
//                        .expireAfterWrite(5, TimeUnit.SECONDS)
                        .refreshAfterWrite(2,TimeUnit.MICROSECONDS)
                        .build(new CacheLoader<String, Employee>() {
                            @Override
                            public Employee load(String employeeId) throws Exception {
                                return getFromDb(employeeId);
                            }
                        });

        try {
            Employee employee1 = null;
            employee1 = employeeCache.get("1");
//            employee1 = employeeCache.getUnchecked("1");
//            employee1 = employeeCache.getIfPresent("1");
            System.out.println(employee1);
            System.out.println("Cache size: " + employeeCache.size());

//            while (true) {
//                Thread.sleep(10);
//            }

//            System.out.println("Finish");

            employeeCache.invalidate("1");
//            employee1 = employeeCache.get("1");
//            System.out.println(employee1);

//            employee1 = employeeCache.get("2");
//            System.out.println(employee1);
//
//            employee1 = employeeCache.get("3");
//            System.out.println(employee1);
//
//            employee1 = employeeCache.get("4");
//            System.out.println(employee1);
//
//            employee1 = employeeCache.get("5");
//            System.out.println(employee1);
//
//            employee1 = employeeCache.get("1");
//            System.out.println(employee1);
//
//            employee1 = employeeCache.get("1");
//            System.out.println(employee1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Employee getFromDb(String employeeId) {
        // Init DB
        Employee emp1 = new Employee(1, "Name 1", 1);
        Employee emp2 = new Employee(2, "Name 2", 2);
        Employee emp3 = new Employee(3, "Name 3", 3);
        Employee emp4 = new Employee(4, "Name 4", 4);
        Employee emp5 = new Employee(5, "Name 5", 5);
        Employee emp6 = new Employee(6, "Name 6", 6);
        Employee emp7 = new Employee(7, "Name 7", 7);
        Employee emp8 = new Employee(8, "Name 8", 8);
        Employee emp9 = new Employee(9, "Name 9", 9);

        Map<String, Employee> database = new HashMap<>();
        database.put("1", emp1);
        database.put("2", emp2);
        database.put("3", emp3);
        database.put("4", emp4);
        database.put("5", emp5);
        database.put("6", emp6);
        database.put("7", emp7);
        database.put("8", emp8);
        database.put("9", emp9);

        //
        System.out.println("Get data from DB");
        return database.get(employeeId);
    }
}
