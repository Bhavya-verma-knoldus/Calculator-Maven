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

import org.scalatest.FunSpec

class CalculatorTest extends FunSpec {

  val calculator = new Calculator

  /*Addition test cases*/
  describe("Addition") {
    it("should be valid when both numbers are positive") {
      assert(16==calculator.addition(10.0,6.0))
    }

    it("should be valid when both numbers are floating point numbers") {
      assert(9.7==calculator.addition(6.5,3.2))
    }

    it("should be valid when both numbers are negative") {
      assert(-14.0==calculator.addition(-8.0,-6.0))
    }

    it("should be valid when one input is 0") {
      assert(8==calculator.addition(0,8.0))
    }

    it("should be invalid as 7 + 9 will not return 12") {
      assert(!(12==calculator.addition(7.0,9.0)))
    }
  }
  /*Addition test cases completed*/


  /*Subtraction test cases*/
  describe("Subtraction") {
    it("should be valid when both numbers are positive") {
      assert(12==calculator.subtraction(28.0,16.0))
    }

    it("should be valid when both numbers are floating point numbers") {
      assert(8.6==calculator.subtraction(15.5,6.9))
    }

    it("should be valid when both numbers are negative") {
      assert(-4.0==calculator.subtraction(-16.0,-12.0))
    }

    it("should be valid when one input is 0") {
      assert(-14.0==calculator.subtraction(0,14.0))
    }

    it("should be invalid as 14 - 2 will not return 10") {
      assert(!(10==calculator.subtraction(14.0,2.0)))
    }
  }
  /*Subtraction test cases completed*/


  /*Multiplication test cases*/
  describe("Multiplication") {
    it("should be valid when both numbers are positive") {
      assert(56==calculator.multiplication(7.0,8.0))
    }

    it("should be valid when both numbers are floating point numbers") {
      assert(14.4==calculator.multiplication(4.5,3.2))
    }

    it("should be valid when both numbers are negative") {
      assert(42==calculator.multiplication(-6.0,-7.0))
    }

    it("should be valid when one number is negative") {
      assert(-24.0==calculator.multiplication(-3.0,8.0))
    }

    it("should be valid when one input is 0") {
      assert(0==calculator.multiplication(12.0,0))
    }

    it("should be invalid as 4 * 6 will not return 25") {
      assert(!(25==calculator.multiplication(4.0,6.0)))
    }
  }
  /*Multiplication test cases completed*/


  /*Division test cases*/
  describe("Division") {
    it("should be valid when both numbers are positive") {
      assert(6==calculator.division(18.0,3.0))
    }

    it("should be valid when both numbers are floating point numbers") {
      assert(3.739130434782609==calculator.division(8.6,2.3))
    }

    it("should be valid when both numbers are negative") {
      assert(4==calculator.division(-20.0,-5.0))
    }

    it("should be valid when one number is negative") {
      assert(-4.0==calculator.division(36.0,-9.0))
    }

    it("should be valid when numerator is 0") {
      assert(0==calculator.division(0,8.0))
    }

    it("should throw exception when denominator is 0") {
      assertThrows[ArithmeticException](calculator.division(6.0,0))
    }

    it("should be invalid as 9/2 will not return 4") {
      assert(!(4==calculator.division(9.0,2.0)))
    }
  }
  /*Division test cases completed*/


  /*Power test cases*/
  describe("Power") {
    it("should be valid when base is positive and exponent is positive") {
      val base = 3
      val exponent = 3
      assert(27==calculator.power(base,exponent))
    }

    it("should be valid when base is positive and exponent is negative") {
      val base = 5
      val exponent = -2
      assert(0.04==calculator.power(base,exponent))
    }

    it("should be valid when base is negative and exponent is positive") {
      val base = -4
      val exponent = 3
      assert(-64.0==calculator.power(base,exponent))
    }

    it("should be valid when base is negative and exponent is negative") {
      val base = -5
      val exponent = -3
      assert(-0.008==calculator.power(base,exponent))
    }

    it("should be invalid as base 4 and exponent 5 will not return 1000") {
      val base = 4
      val exponent = 5
      assert(!(1000==calculator.power(base,exponent)))
    }
  }
  /*Power test cases completed*/


  /*Absolute test cases*/
  describe("Absolute") {
    it("should be valid when number is positive") {
      assert(26==calculator.absolute(26.0))
    }

    it("should be valid when number is negative") {
      assert(17==calculator.absolute(-17.0))
    }

    it("should be valid when number is floating point number") {
      assert(26.4==calculator.absolute(-26.4))
    }

    it("should be invalid as -5 will not return 7") {
      assert(!(7==calculator.absolute(-5.0)))
    }
  }
  /*Absolute test cases completed*/


  /*Modulus test cases*/
  describe("Modulus") {
    it("should be valid when both numbers are positive") {
      assert(4==calculator.modulus(25.0,7.0))
    }

    it("should be valid when dividend is negative") {
      assert(-2.0==calculator.modulus(-8.0,3.0))
    }

    it("should be valid when divisor is negative") {
      assert(2==calculator.modulus(12.0,-5.0))
    }

    it("should throw exception when divisor is 0") {
      assertThrows[ArithmeticException](calculator.modulus(8.0,0))
    }

    it("should be valid when dividend is 0") {
      assert(0==calculator.modulus(0,4.0))
    }

    it("should be invalid as 17 % 6 will not return 3") {
      assert(!(3==calculator.modulus(17.0,6.0)))
    }
  }
  /*Modulus test cases completed*/


  /*MaximumOfTwo test cases*/
  describe("Maximum of Two") {
    it("should be valid when both are positive numbers") {
      assert(23==calculator.maximumOfTwo(16.0,23.0))
    }

    it("should be valid when one number is negative") {
      assert(8==calculator.maximumOfTwo(8.0,-4.0))
    }

    it("should be valid when both numbers are negative") {
      assert(-17.0==calculator.maximumOfTwo(-17.0,-25.0))
    }

    it("should be valid when one number is 0") {
      assert(19==calculator.maximumOfTwo(0,19.0))
    }

    it("should be invalid as 13 is not maximum in 13 and 21") {
      assert(!(13==calculator.maximumOfTwo(13.0,21.0)))
    }
  }
  /*MaximumOfTwo test cases ended*/


  /*MinimumOfTwo test cases*/
  describe("Minimum of Two") {
    it("should be valid when both are positive numbers") {
      assert(12==calculator.minimumOfTwo(12.0,35.0))
    }

    it("should be valid when one number is negative") {
      assert(-7.0==calculator.minimumOfTwo(13.0,-7.0))
    }

    it("should be valid when both numbers are negative") {
      assert(-23.0==calculator.minimumOfTwo(-14.0,-23.0))
    }

    it("should be valid when one number is 0") {
      assert(0==calculator.minimumOfTwo(0,19.0))
    }

    it("should be invalid as 18 is not minimum in 13 and 18") {
      assert(!(18==calculator.minimumOfTwo(13.0,18.0)))
    }
  }
  /*MinimumOfTwo test cases ended*/
}
