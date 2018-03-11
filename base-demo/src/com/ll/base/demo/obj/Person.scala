package com.ll.base.demo.obj

class Person {

  var name: String = ""
  var age: Integer = 0

  def getName(): String = {
    return name;
  }

  def getAge(): Integer = {
    return age;
  }

  override
  def toString(): String = {
    return "Person [age = "+ age +", name = " + name + "]";
  }

}