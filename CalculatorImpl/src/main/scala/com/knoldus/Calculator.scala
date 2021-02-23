// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

class Calculator {

  def addition(number1: Double,number2: Double): Double = {
    number1 + number2
  }

  def subtraction(number1: Double,number2: Double): Double = {
    number1 - number2
  }

  def multiplication(number1: Double,number2: Double): Double = {
    number1 * number2
  }

  def division(numerator: Double,denominator: Double): Double = {
    if(denominator == 0){
      throw new ArithmeticException("Divide by zero operation not possible")
    }
    else{
      numerator / denominator
    }
  }

  def power(base: Int, exponent: Int): Double = {
    var result: Double = 1.0

    /*Finding absolute value of exponent*/
    var absoluteExponent = absolute(exponent)

    /*Calculating power of a number by multiplying it exponent times*/
    for (count <- 0 until absoluteExponent.toInt) {
      result *= base
    }

    if(exponent < 0) 1.0/result else result
  }

  def absolute(number: Double): Double  = {
    if(number >= 0) number else -number
  }

  def modulus(dividend: Double, divisor: Double): Double = {
    if(divisor == 0){
      throw new ArithmeticException("Divisor cannot be 0")
    }
    else{
      dividend % divisor
    }
  }

  def maximumOfTwo(number1: Double, number2: Double): Double = {
    if(number1 > number2) number1 else number2
  }

  def minimumOfTwo(number1: Double, number2: Double): Double = {
    if(number1 < number2) number1 else number2
  }

}
