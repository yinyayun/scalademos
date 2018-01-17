package org.yinyayun.scala.companion
/**
 * 伴生对象
 */
class Companion {
  private var sum = 0
  def add(a: Int) { sum += a }
  def printSum() { print("sum值:" + sum) }
}

object Companion {
  def decrease(a: Int, com: Companion) {
    //可以访问伴生类的私有成员
    com.sum = com.sum - a;
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val com = new Companion
    com.add(10)
    //单例对象，直接访问
    Companion.decrease(5, com)
    com.printSum()
  }
}