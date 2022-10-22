package function_solve

import composite.component.*
import composite.composite.implementation.Division
import org.scalatest.funsuite.AnyFunSuite
import util.variable_input_method.DefinedVariableInputMethod

class DivisionTest extends AnyFunSuite {

  test("3 / 2 = 1.5") {
    val division = Division(NumberComponent(3), NumberComponent(2))
    val result = division.calculate
    assert(result == 1.5)
  }

  test("9 / 3 / 2 = 1.5") {
    val division = Division(Division(NumberComponent(9), NumberComponent(3)) ,NumberComponent(2))
    val result = division.calculate
    assert(result == 1.5)
  }

  test("a=1 / 2 = 0.5") {
    val division = Division(VariableComponent("a", DefinedVariableInputMethod(1)), NumberComponent(2))
    val result = division.calculate
    assert(result == 0.5)
  }

  test("3 / -2 = -1.5") {
    val division = Division(NumberComponent(3), NumberComponent(-2))
    val result = division.calculate
    assert(result == -1.5)
  }

  test("-3 / -2 = 1.5") {
    val division = Division(NumberComponent(-3), NumberComponent(-2))
    val result = division.calculate
    assert(result == 1.5)
  }

  test("3 / 0 = Infinity") {
    val division = Division(NumberComponent(3), NumberComponent(0))
    val result = division.calculate
    assert(result == Double.PositiveInfinity)
  }
}
