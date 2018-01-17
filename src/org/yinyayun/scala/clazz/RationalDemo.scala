package org.yinyayun.scala.clazz

/**
 * 分数测试
 */
/**
 * 创建分数类,最简洁的方式为：class Rational(n: Int, d: Int)
 */
class Rational(n: Int, d: Int) {
  require(d != 0)
  def this(n: Int) = this(n, 1)
  override def toString() = n + "/" + d
  def +(that: Rational): Rational = add(that)
  def add(that: Rational): Rational =
    new Rational(n * that.getd() + that.getn() * d, d * that.getd())

  def getn() = n
  def getd() = d
}

object Rational {
  implicit def intToRational(x: Int) = {
    println("调用intToRational()")
    new Rational(x)
  }
}
object RationalDemo {

  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val oneThird = new Rational(1, 3)
    //
    println("oneHalf.add(oneThird):\t" + oneHalf.add(oneThird))
    //
    println("oneHalf+ oneThird:\t" + (oneHalf + oneThird))
    //
    println("oneHalf+ 2:\t" + (oneHalf + 2))
    //
    val three = new Rational(3)
    println(three.toString())
    

  }
}