package function_solve

import composite.composite.implementation.Sum
import composite.component.*
import org.scalatest.funsuite.AnyFunSuite

class SumTest extends AnyFunSuite {

    test("Number + Number should return Number") {
      val sum = Sum(List(NumberComponent(1)), List(NumberComponent(2)))
      val result = sum.calculate()
      assert(result == 3)
    }

}
