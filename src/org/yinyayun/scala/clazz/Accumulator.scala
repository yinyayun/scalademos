package org.yinyayun.scala.clazz

class Accumulator {

  def add(a: Int, b: Int) = {
    a + b
  }

  def test() {
    val message = "不含有等号定义的函数，无论方法体中是什么返回至永远为空"
    return message
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val accumulator = new Accumulator()
    println("3+2=" + accumulator.add(2, 3))
    print("测试test()结果：" + accumulator.test())
  }
}