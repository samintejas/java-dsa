package io.samin.leetcode.easy;

public class NumOfSeniorCitizen {

    public static void main(String[] args) {
        
        String[] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(numOfSen(arr));
    }

    private static int numOfSen(String[] arr) {

        int count = 0;
        for(int i =0; i < arr.length ; i++) {

            if (Integer.valueOf(arr[i].substring(11,13)) > 60) {
                count++;
            }
        }

        return count;

    }

}
