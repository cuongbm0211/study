package com.study.generic.java9s;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CuongBM on 3/26/2017.
 */
public class MainGeneric {
    public static void main(String[] args) {
        Glass<Juice> juiceGlass = new Glass<Juice>();
        Glass<?> juiceAnyType = new Glass<Juice>();

//        Glass<?> orangeGlass = new Glass<Orange>();
//        Glass<? extends Milk> glassMilk = new Glass<OngTho>();
//        glassMilk.add(new Milk());
//        System.out.println();

        List<Water> waters = new ArrayList<>();
        waters.add(new Juice());

        List<Juice> juices = new ArrayList<>();
        waters = juices; // ?
    }

}
