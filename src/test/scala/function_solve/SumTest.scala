package function_solve

import composite.composite.implementation.Sum
import composite.component.*
import org.scalatest.funsuite.AnyFunSuite

class SumTest extends AnyFunSuite {

  test("1 + 2 = 3") {
    val sum = Sum(List(NumberComponent(1), NumberComponent(2)))
    val result = sum.calculate()
    assert(result == 3)
  }

  test("(1 + 2 + 3 = 6") {
    val sum = Sum(List(NumberComponent(1), NumberComponent(2),NumberComponent(3)))
    val result = sum.calculate()
    assert(result == 6)
  }
}
