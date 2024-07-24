package io.samin.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortJumbledNumbers {

    public static void main(String[] args) {

        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] numbs = {991,338,38};
        int[] output = sortJumbled(mapping,numbs);

    }

    private static int[] sortJumbled(int[] mapping, int[] numbs) {

        int[] out = {};
        Map<Integer,Integer> map = new HashMap<>();

        for (int numb : numbs) {
            String numberString = Integer.toString(numb);

            String newNum = "";
            for (int i = 0; i < numberString.length(); i++) {
                newNum = newNum + mapping[Character.getNumericValue(numberString.charAt(i))];
            }
            Integer newNumInt = Integer.valueOf(newNum);
            map.put(numb,newNumInt);
        }

        Integer[] boxedNum = Arrays.stream(numbs).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNum, Comparator.comparingInt(map::get));

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = boxedNum[i];
        }


        return numbs;

    }
}
