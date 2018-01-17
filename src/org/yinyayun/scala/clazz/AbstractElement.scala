package org.yinyayun.scala.clazz

/**
 * 定义抽象类
 */
abstract class AbstractElement {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}