package com.ll.base.demo

import scala.io.Source
import com.ll.base.demo.obj.Person
import com.ll.base.demo.obj.CheckSumAccumulator

object Demo {
  
  def main(args: Array[String]): Unit = {
//   testMap()
    testObj()
  }
  
  def testMap() = {
     val map = Map(1 -> "asd", 2 -> "asdasd")
    println(map)
    println(map.mkString("\n"))
  }
  
  def testSource() = {
    val lines = Source.fromFile("D:/a.txt").getLines().toList
//    for(line <- lines) {
//      println(line)
//    }
    
    println(lines.reduceLeft((l1, l2) => if(l1.length() > l2.length()) l1 else l2)) 
    
  }
  
  def testObj() {
//    val person = new Person
//    person.age = 100
//    person.name = "zhangsan"
//    println(person)
    
    var accumulate = new CheckSumAccumulator
    accumulate.sum = 199
    println(accumulate.accumulate())
  }
}