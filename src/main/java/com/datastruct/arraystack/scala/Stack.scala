package com.datastruct.arraystack.scala

trait Stack[T] {
  // 获取栈大小
  def getSize: Int

  // 判断栈是否为空
  def isEmpty: Boolean

  // 返回栈顶元素（不取出）
  def top: T

  // 元素入栈
  def push(element: T): Unit

  // 元素出栈
  def pop: T
}
