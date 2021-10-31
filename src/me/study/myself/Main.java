package me.study.myself;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("-- Tree Map");
        main.treeMapEx();

        System.out.println("-- Tree Set");
        main.treeSetEx();

        System.out.println("-- Hash Map");
        main.mapEx();
    }

    private void treeMapEx() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("f", "d");
        treeMap.put("c", "c");
        treeMap.put("d", "b");
        treeMap.put("e", "a");

        System.out.println(treeMap);
        System.out.println(treeMap.get("c"));
        treeMap.remove("d");
        System.out.println(treeMap);
    }

    private void treeSetEx() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println(treeSet);
    }

    private void mapEx() {
        Map<String, String> map = new HashMap<>();
        map.put("f", "d");
        map.put("c", "c");
        map.put("d", "b");
        map.put("e", "a");

        for (Map.Entry<String, String> entity : map.entrySet()) {
            System.out.format("key : %s , val :  %s", entity.getKey(), entity.getValue());
            System.out.println();
        }
    }
}
