package com.datastruct.arraystack.scala

object ArrayStackTest {
  def main(args: Array[String]): Unit = {
    val arrayStack = ArrayStack[Int](2)

    println(arrayStack.isEmpty)
    println(arrayStack.getSize)

    arrayStack.push(1)
    arrayStack.push(2)
    arrayStack.push(3)

    println(arrayStack.isEmpty)
    println(arrayStack.getSize)


  }
}
