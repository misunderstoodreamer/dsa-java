package com.dsa;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // LinkedList = stores Nodes in 2 parts (data + address)
        //              Nodes are in non-consecutive memory locations
        //              Elements are linked using pointers

        //                            Singly Linked List
        //                Node              Node                Node
        //          [data | address] -> [data | address] -> [data | address]

        //                            Doubly Linked List
        //                   Node                           Node
        //        [address | data | address] <-> [address | data | address]

        // advantages?
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of Nodes are easy 0(1)
        // 3. No/Low memory loss

        // disadvantages
        // 1. Greater memory usage (additional pointer)
        // 2. No random access of elements (has no index)
        // 3. Accessing/Searching elements is more time consuming. O(n)

        // uses of linkedlist?
        // 1. implementation of stacks/queues
        // 2. GPS navigation
        // 3. music playlist


        LinkedList<String> linkedList = new LinkedList<>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);
        */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        System.out.println(linkedList);
        linkedList.remove("E");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        System.out.println("Removed first element is: " + first);
        String last = linkedList.removeLast();
        System.out.println("Removed last element is: " + last);

        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("A"));
    }
}
