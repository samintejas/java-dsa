package io.samin.leetcode.medium;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        List<Integer> substringSizeList = new ArrayList<>();


        for (int i = 0; i < chars.length; i++) {
            System.out.println("c : "+ chars[i]);
            List<Character> characters = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                if(!characters.contains(chars[j])) {
                    characters.add(chars[j]);
                } else {
                    break;
                }
            }
            substringSizeList.add(characters.size());
        }

        Collections.sort(substringSizeList);

        return substringSizeList.get(substringSizeList.size()-1);


    }


}
