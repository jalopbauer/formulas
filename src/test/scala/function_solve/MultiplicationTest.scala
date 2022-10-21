package function_solve

import composite.component.*
import composite.composite.implementation.Multiplication
import org.scalatest.funsuite.AnyFunSuite
import util.variable_input_method.DefinedVariableInputMethod

class MultiplicationTest extends AnyFunSuite {

  test("1 * 2 = 2") {
    val multiplication = Multiplication(List(NumberComponent(1), NumberComponent(2)))
    val result = multiplication.calculate()
    assert(result == 2d)
  }

  test("2 * 2 * 2 = 8") {
    val multiplication = Multiplication(List(NumberComponent(2), NumberComponent(2),NumberComponent(2)))
    val result = multiplication.calculate()
    assert(result == 8d)
  }

  test("a=2 + 2 = 4") {
    val multiplication = Multiplication(List(VariableComponent("a", DefinedVariableInputMethod(2)), NumberComponent(2)))
    val result = multiplication.calculate()
    assert(result == 4d)
  }

  test("0 * 2 = 0") {
    val multiplication = Multiplication(List(NumberComponent(0), NumberComponent(2)))
    val result = multiplication.calculate()
    assert(result == 0d)
  }

  test("-1 * 2 = -2") {
    val multiplication = Multiplication(List(NumberComponent(-1), NumberComponent(2)))
    val result = multiplication.calculate()
    assert(result == -2d)
  }

  test("-1 * -2 = 2") {
    val multiplication = Multiplication(List(NumberComponent(-1), NumberComponent(-2)))
    val result = multiplication.calculate()
    assert(result == 2d)
  }
}
