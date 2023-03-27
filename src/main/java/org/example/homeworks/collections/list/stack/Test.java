package org.example.homeworks.collections.list.stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.isEmpty();
        System.out.println(stack.getStack());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getStack());
        stack.pop();
        System.out.println(stack.getStack());
        stack.isEmpty();
        System.out.println(stack.getStack());
        stack.pop();
        System.out.println(stack.getStack());
        stack.pop();
        System.out.println(stack.getStack());
    }
}
