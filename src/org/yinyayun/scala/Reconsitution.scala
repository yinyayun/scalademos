package org.yinyayun.scala
/**
 * 重构
 */
object Reconsitution {
  def searchOdd(numbers: List[Int]) = for (number <- numbers if number % 2 == 0) yield number
  def searchEven(numbers: List[Int]) = for (number <- numbers if number % 2 == 1) yield number

  /**
   * 重构后
   */
  def search(numbers: List[Int], matcher: Int => Boolean) = for (number <- numbers if matcher(number)) yield number

  def main(args: Array[String]): Unit = {
    val array = List(1, 2, 3, 4, 5, 6, 7, 9)
    println(searchOdd(array))
    println(searchEven(array))
    println(search(array, x => x % 2 == 0))
    println(search(array, x => x % 2 == 1))
  }
}