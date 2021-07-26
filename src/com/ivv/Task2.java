package com.ivv;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        ListNode current = generateList(15);
        printListNode(current);
        System.out.println();
        printListNode(deleteDuplicates(current));
    }

    private static void printListNode(ListNode current) {
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode generateList(int number) {
        ListNode head = new ListNode();
        ListNode current = head;
        Random random = new Random();
        int currentValue;
        int previousValue = 0;
        for (int i = 0; i < number; i++) {
            ListNode node = new ListNode();
            currentValue = random.nextInt(10);
            while (currentValue < previousValue) {
                currentValue = previousValue + random.nextInt(10);
            }
            node.val = currentValue;
            current.next = node;
            current = current.next;
            previousValue = currentValue;
        }
        return head.next;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        while (current.next != null) {
            if (current.val==current.next.val) {
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
    }
}