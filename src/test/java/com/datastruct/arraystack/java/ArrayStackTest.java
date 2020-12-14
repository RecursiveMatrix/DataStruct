package com.datastruct.arraystack.java;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(10);

        arrayStack.push(1);

        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.top());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.isEmpty());
    }
}
