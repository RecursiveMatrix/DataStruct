package com.datastruct.arraystack.java;

public interface Stack<T> {
    // 获取栈大小
    int getSize();

    // 栈是否为空
    boolean isEmpty();

    // 取出栈顶元素（但不删除）
    T top() throws ExceptionStackEmpty;

    // 进栈
    void push(T t) throws ExceptionArrayStackFull;

    // 出栈
    T pop() throws ExceptionStackEmpty;
}
