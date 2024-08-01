package io.samin.other;

import java.util.ArrayList;
import java.util.List;

public class RevArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);
    }

    private static int[]  reverse(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }

        System.out.println(list);

        int[] arrre = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrre[i] = list.get(i);
        }

        return arrre;



    }
}
