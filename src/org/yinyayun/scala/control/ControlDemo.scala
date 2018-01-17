package org.yinyayun.scala.control
/**
 * Scala中控制语句
 */
object ControlDemo {

  def main(args: Array[String]): Unit = {
    //遍历
    for (i <- 0 to 10 if i % 2 == 0; if i % 4 == 0)
      println(i)
    //yield
    val numbers = for (i <- 0 to 10 if i % 2 == 0; if i % 4 == 0) yield i
    println(numbers)
    //match表达式
    val matchVal = "123"
    matchVal match {
      case "111" => "1"
      case "121" => "2"
      case "123" => "3"
    }
    //
  }
}