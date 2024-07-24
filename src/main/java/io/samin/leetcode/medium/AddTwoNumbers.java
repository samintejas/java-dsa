package io.samin.leetcode.medium;

import io.samin.customds.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {


        String in1 = "9999999";
        String in2 = "9999";

        char[] in1ch = in1.toCharArray();
        char[] in2ch = in2.toCharArray();

        ListNode inhead1 = new ListNode();
        ListNode firstNode1 = null;

        for (int i = 0; i < in1ch.length; i++) {
            //  System.out.println(in1ch[i]);
            if (firstNode1 == null) {
                firstNode1 = inhead1;
            }
            inhead1.val = Character.getNumericValue(in1ch[i]);
            inhead1.next = new ListNode();
            inhead1 = inhead1.next;
        }

        ListNode inhead2 = new ListNode();
        ListNode firstNode2 = null;

        for (int i = 0; i < in2ch.length; i++) {


            if (firstNode2 == null) {
                firstNode2 = inhead2;
            }
            //  System.out.println(in2ch[i]);
            inhead2.val = Character.getNumericValue(in2ch[i]);
            inhead2.next = new ListNode();
            inhead2 = inhead2.next;
        }

        addTwoNumbers(firstNode1, firstNode2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyList = new ListNode(0);
        ListNode tail = dummyList;
        int carry = 0;

        while(l1 !=null || l2 != null || carry != 0){

            int d1 = (l1 != null)  ? l1.val : 0;
            int d2 = (l2 != null)  ? l2.val : 0;

            int sum = d1 + d2 + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }

        ListNode result = dummyList.next;
        dummyList.next = null;
        return result;



    }


}
