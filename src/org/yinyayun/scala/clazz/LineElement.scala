package org.yinyayun.scala.clazz

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def height = s.length()
  override def width = 1
}