package io.samin.other;

public class Palindrom {

    public static void main(String[] args) {
        String s = "malassalam";

        Boolean result = checkPalindrom(s);
        System.out.println(result);
    }

    private static Boolean checkPalindrom(String s) {

        char[] ch = s.toCharArray();
        int length = s.length();
        int mid = length /2;
//        int mod = length %2;
//        if(mod != 0) {
//            mid = mid -1;
//        }

        for (int i = 0; i < mid ; i++) {
            if(ch[i] != ch[ch.length-1-i]) {
                return false;
            }
        }

        return true;
        

    }


}
