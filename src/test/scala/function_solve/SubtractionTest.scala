package function_solve

import composite.component.*
import composite.composite.implementation.Subtraction
import org.scalatest.funsuite.AnyFunSuite
import util.variable_input_method.DefinedVariableInputMethod

class SubtractionTest extends AnyFunSuite {

  test("3 - 2 = 1") {
    val subtraction = Subtraction(NumberComponent(3), NumberComponent(2))
    val result = subtraction.calculate()
    assert(result == 1d)
  }

  test("1 - 2 - 3 = -4") {
    val subtraction = Subtraction(Subtraction(NumberComponent(1), NumberComponent(2)) ,NumberComponent(3))
    val result = subtraction.calculate()
    assert(result == -4d)
  }

  test("a=1 - 2 = -1") {
    val subtraction = Subtraction(VariableComponent("a", DefinedVariableInputMethod(1)), NumberComponent(2))
    val result = subtraction.calculate()
    assert(result == -1)
  }

  test("3 - -2 = 5") {
    val subtraction = Subtraction(NumberComponent(3), NumberComponent(-2))
    val result = subtraction.calculate()
    assert(result == 5d)
  }
}
