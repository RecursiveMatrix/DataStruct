package com.datastruct.arraystack.java;

public class ArrayStack<T> implements Stack<T> {
    public static final int CAPACITY = 1024;  // 数组默认容量
    protected int capacity; // 数组实际容量
    protected T[] arrayT;  // 对象数组
    protected int top = -1; // 栈顶元素指针

    public ArrayStack() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new ExceptionStackEmpty("不能创建空栈！容量必须大于0");
        }
        this.capacity = capacity;
        arrayT = (T[]) new Object[capacity];
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public T top() throws ExceptionStackEmpty {
        if (top == -1) {
            throw new ExceptionStackEmpty("栈为空，无法获取栈顶数据");
        }

        return this.arrayT[top];
    }

    @Override
    public void push(T t) {
        if (top == capacity - 1) {
            throw new ExceptionStackEmpty("栈已满，数据无法入栈");
        }
        ++top;
        arrayT[top] = t;
    }

    @Override
    public T pop() throws ExceptionStackEmpty {
        if (top == -1) {
            throw new ExceptionStackEmpty("栈为空，无数据可出栈");
        }
        --top;
        return arrayT[top + 1];
    }
}
