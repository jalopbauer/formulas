package composite.calculate_test

import composite.component.*
import composite.composite.implementation.Power
import org.scalatest.funsuite.AnyFunSuite
import util.variable_input_method.DefinedVariableInputMethod

class PowerTest extends AnyFunSuite {

  test("1 ^ 2 = 2") {
    val power = Power(NumberComponent(1), NumberComponent(2))
    val result = power.calculate
    assert(result == 1d)
  }

  test("2 ^ 2 = 4") {
    val power = Power(NumberComponent(2), NumberComponent(2))
    val result = power.calculate
    assert(result == 4d)
  }

  test("-2 ^ 2 = 4") {
    val power = Power(NumberComponent(-2), NumberComponent(2))
    val result = power.calculate
    assert(result == 4d)
  }

  test("2 ^ -2 = 0.25") {
    val power = Power(NumberComponent(2), NumberComponent(-2))
    val result = power.calculate
    assert(result == 0.25d)
  }

  test("2 ^ 2 ^ 2 = 16") {
    val power = Power(Power(NumberComponent(2), NumberComponent(2)), NumberComponent(2))
    val result = power.calculate
    assert(result == 16d)
  }
}
