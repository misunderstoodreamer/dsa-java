package com.dsa;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        // Priority Queue = FIFO data structure. First-In First-Out (ex. A line of people - First come first serve)
        //                  It serves elements with highest priorities first before elements with lower priority

        // comment out each one of them and see the result
        Queue<Double> gpa = new PriorityQueue<>(Collections.reverseOrder());
        // Queue<Double> gpa = new PriorityQueue<>();
        // Queue<Double> gpa = new LinkedList<>();

        gpa.offer(3.0);
        gpa.offer(2.5);
        gpa.offer(4.0);
        gpa.offer(1.5);
        gpa.offer(2.0);

        while (!gpa.isEmpty()){
            System.out.println(gpa.poll());
        }

        System.out.println("---");


        Queue<String> letter = new PriorityQueue<>();

        letter.offer("B");
        letter.offer("A");
        letter.offer("E");
        letter.offer("D");
        letter.offer("C");


        while (!letter.isEmpty()){
            System.out.println(letter.poll());
        }

        // Think of a queue, but it sorts alphabetically, numerically, etc..
    }
}
