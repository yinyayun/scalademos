package org.yinyayun.scala.file

import scala.io.Source

/**
 * 计算文件中最长行
 */
object Main {

  def maxLineLenType1(): Int = {
    val file = Source.fromFile("data/scala.txt", "utf-8")
    file.getLines().map(line => line.length()).max
  }

  def maxLineLenType2(): Int = {
    val lines = Source.fromFile("data/scala.txt", "utf-8").getLines()
    var maxLen = 0
    for (line <- lines)
      maxLen = maxLen.max(line.length())
    return maxLen
  }

  def maxLineLenType3(): Int = {
    val lines = Source.fromFile("data/scala.txt", "utf-8").getLines()
    lines.reduceRight((l1, l2) => if (l1.length > l2.length) l1 else l2).length()
  }

  def main(args: Array[String]): Unit = {
    //方式一
    println("方式一：" + maxLineLenType1())
    println("方式二：" + maxLineLenType2())
    println("方式三：" + maxLineLenType3())
  }
}

