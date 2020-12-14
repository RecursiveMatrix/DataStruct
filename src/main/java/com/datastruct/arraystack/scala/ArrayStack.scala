package com.datastruct.arraystack.scala

import ArrayStack.CAPACITY

class ArrayStack[T](capacity: Int = CAPACITY) extends Stack[T] {
  // 类初始化流程
  if (capacity <= 0) {
    throw new ExceptionStackEmpty("不能创建空栈，capacity值必须大于0")
  }

  protected val elementArray: Array[T] =  Array[Any](capacity).asInstanceOf[Array[T]] // 栈底层数组

  protected var topPointer: Int = -1  // 栈顶指针
  
  override def getSize: Int = topPointer + 1

  override def isEmpty: Boolean = topPointer == -1

  override def top: T = {
    if (topPointer == -1) {
      throw new ExceptionStackEmpty("栈为空，无法获取栈顶数据")
    }

    elementArray(topPointer)
  }

  override def push(element: T): Unit = {
    if (topPointer == capacity - 1) {
      throw new ExceptionArrayStackFull("栈已满，数据无法进栈")
    }

    topPointer += 1
    elementArray(topPointer)
  }

  override def pop: T = {
    if (topPointer == -1) {
      throw new ExceptionStackEmpty("栈为空，无数据可出栈")
    }

    topPointer -= 1
    elementArray(topPointer + 1)
  }
}

object ArrayStack {
  val CAPACITY = 1024 // 数组默认容量

  def apply[T](): ArrayStack[T] = new ArrayStack[T]()

  def apply[T](capacity: Int): ArrayStack[T] = new ArrayStack[T](capacity)
}
