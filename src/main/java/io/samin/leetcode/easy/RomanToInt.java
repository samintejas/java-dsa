package io.samin.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String roman = "MCMXCIV";

        System.out.println(romanToInt(roman));
    }

    private static int romanToInt(String roman) {

        Map<String,Integer> romanMap = new HashMap<>();
        int num = 0;
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        for (char c : roman.toCharArray()) {
            num = num + romanMap.get(c+"");
        }

        return num;


    }
}
