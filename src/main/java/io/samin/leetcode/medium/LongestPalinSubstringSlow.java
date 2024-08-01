package io.samin.leetcode.medium;

public class LongestPalinSubstringSlow {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {

        if(s.length() == 1) return s;

        String longestSub = "";
        Integer longestLeng = 0;


        for (int i = 1; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {

                String subs = s.substring(i,j);
                subs = checkSubsctrPalindrome(subs);

                if(subs!= null) {
                    if(longestLeng <= subs.length()) {
                        longestSub  = subs;
                        longestLeng = subs.length();
                    }
                }

            }
        }


        return longestSub;
    }

    private static String checkSubsctrPalindrome(String s) {

        char[] ch = s.toCharArray();
        int length = s.length();
        int mid = length /2;

        for (int i = 0; i < mid ; i++) {
            if(ch[i] != ch[ch.length-1-i]) {
                return null;
            }
        }

        return s;
    }
}
