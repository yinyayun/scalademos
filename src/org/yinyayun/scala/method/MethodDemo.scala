package org.yinyayun.scala.method

/**
 * 函数
 */
object MethodDemo {
  def main(args: Array[String]): Unit = {
    var increase = (x: Int) => x + 9999
    println(increase(1))
    //
    increase = (x: Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
    println(increase(1))
    //占位符
    println("====占位符====")
    val filters = List(1, 2, 3, 11, 14).filter(_ > 2)
    println(filters)
    val f = (_: Int) + (_: Int)
    println(f(1, 2))
    //偏应用函数
    println("====偏应用函数====")
    def sum(a: Int, b: Int, c: Int) = a + b + c
    val a = sum _
    println(a(1, 2, 3))
    //闭包
    println("====闭包====")
    var more = 1
    val addMore = (x: Int) => x + more
    println(addMore(1))
    more = 100
    println(addMore(1))
    //变长参数
    println("====变长参数====")
    def printDemo(args: String*) = args.foreach(println _)
    printDemo("hello", "scala")
    val array = Array("hello", "world!")
    printDemo(array: _*)
    
  }
}