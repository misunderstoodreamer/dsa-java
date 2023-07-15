package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Queue = FIFO data structure. First-In First-Out (ex. A line of people - First come first serve)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure

        //         add      = enqueue, offer()
        //         remove   = dequeue, poll()


        // you cannot instantiate the Queue object because this Queue is an interface.
        // interface is like a template, so to utilize Queue, you need a class that implements Queue

        // Queue<String> queue = new Queue<String>();

        Queue<String> queue = new LinkedList<>();

        queue.offer("Yavuz");
        queue.offer("Kfk");
        queue.offer("Çağatay");
        queue.offer("Eren");

        System.out.println(queue);
        System.out.println("Who's the first person on the queue: " + queue.peek());

        // Remove the first person from the queue
        queue.poll();
        System.out.println(queue);

        // poll() and element() does the same thing, but element() throw exception.
        // for more, check out the Queue interface.

        // Queue is also implemented from Collection, so you can use all of the collection's methods.
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("How many poeple in the queue: " + queue.size());
        System.out.println("Is Kfk is in the line? " + queue.contains("Kfk"));

        // uses of queues?
        // 1. uses in LinkedLists, PriorityQueues, Bread-first search
    }
}
