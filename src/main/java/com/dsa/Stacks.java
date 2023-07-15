package com.dsa;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() add to the top
        //         pop() remove from the top

        Stack<String> stack = new Stack<>();
        System.out.println("Empty Stack? -> "+ stack.empty());

        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");
        stack.push("Item4");
        stack.push("Item5");

        System.out.println("Empty Stack? -> "+ stack.empty());
        System.out.println("What's in the Stack? -> " + stack);

        stack.pop();
        System.out.println("What's in the Stack? -> " + stack);

        String popedItem = stack.pop();
        System.out.println("What's poped in the Stack? -> " + popedItem);
        System.out.println("What's in the Stack? -> " + stack);

        // every time you pop() sth, it returns obj.
        // so if obj is empty it returns EmptyStackException.
        // you can try with multiple stack.pop()

        // to check top item, you can use peek() method
        System.out.println("What's the top item? -> " + stack.peek());

        // to find the item's position, you can use search() method
        System.out.println("What's the Item1's position? -> " + stack.search("Item1"));

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algoritms (maze, file directories)
        // 4. calling functions (call stack)
    }
}