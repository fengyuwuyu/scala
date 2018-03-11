package com.ll.base.demo.obj

class CheckSumAccumulator {
  
  var sum = 0
  
  def add(byte: Byte): Unit = sum += byte
  
  def accumulate(): Int = ~(sum & 0xFF) + 1
}