/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.printmatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Hero
 */
public class Main {

    public static void main(String[] args) {
//        int[][] adjMatrix = new int[25000][25000];
//        List<String> vertices = new ArrayList<>();
//        vertices.add("gfh");
//        System.out.println(vertices.size());
//        vertices.add("gfh");
//        System.out.println(Integer.MAX_VALUE);
//Mimimum acceptable free memory you think your app needs
//        long minRunningMemory = (1024 * 1024);
//
//        Runtime runtime = Runtime.getRuntime();
//        System.out.println("freememory:" + runtime.freeMemory());
//        System.out.println("minRunningMemory:" + minRunningMemory);
//
//        if (runtime.freeMemory() < minRunningMemory) {
//            System.gc();
//        }\

        Map m1 = new HashMap();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hyden");
        m1.put("schildt", "java2s");
        System.out.println(m1.keySet());
        System.out.println(m1.values());

        SortedMap sm = new TreeMap();
        sm.put("map", "TreeMap");
        sm.put("schildt", "java2");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2s");
        System.out.println(sm.keySet());
        System.out.println(sm.values());

        LinkedHashMap lm = new LinkedHashMap();
        lm.put("map", "LinkedHashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        System.out.println(lm.keySet());
        System.out.println(lm.values());

        int[][] mat = new int[][] {
                {3, 5, 7, 9},
                {2, 4, 6},
                {10, 12}
        };
        Arrays.stream(mat).map(Arrays::toString).forEach(System.out::println);
    }

}
