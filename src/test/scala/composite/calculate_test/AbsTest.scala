package composite.calculate_test

import composite.component.*
import composite.composite.implementation.{Abs, Sum}
import org.scalatest.funsuite.AnyFunSuite
import util.variable_input_method.DefinedVariableInputMethod

class AbsTest extends AnyFunSuite {

  test("|1| = 1") {
    val sum = Abs(NumberComponent(1))
    val result = sum.calculate
    assert(result == 1)
  }

  test("|-1| = 1") {
    val sum = Abs(NumberComponent(-1))
    val result = sum.calculate
    assert(result == 1)
  }

  test("|-1| + 2 = 3") {
    val sum = Sum(List(Abs(NumberComponent(-1)),NumberComponent(2)))
    val result = sum.calculate
    assert(result == 3)
  }

  test("|a=1| = 1") {
    val sum = Abs(VariableComponent("a", DefinedVariableInputMethod(1)))
    val result = sum.calculate
    assert(result == 1)
  }
}
