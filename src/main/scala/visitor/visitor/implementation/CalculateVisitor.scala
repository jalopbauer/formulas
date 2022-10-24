package visitor.visitor.implementation

import visitor.component.VariableComponent
import visitor.visitor.FunctionVisitor
import visitor.component.*

import scala.math.pow

case class CalculateVisitor(totalValue:Double) extends FunctionVisitor():
  def visit(functionComponent:FunctionComponent): CalculateVisitor = functionComponent match
    case variableComponent: VariableComponent => CalculateVisitor(variableComponent.variableInputMethod.receiveVariableValue(variableComponent.name))
    case numberComponent: NumberComponent => CalculateVisitor(numberComponent.number)
    case sum: Sum =>
      CalculateVisitor(sum.functionComponents.map(functionComponent => CalculateVisitor(0d).visit(functionComponent).totalValue).sum)
    case multiplication: Multiplication =>
      CalculateVisitor(multiplication.functionComponents.map(functionComponent => CalculateVisitor(1d).visit(functionComponent).totalValue).foldLeft(1d)((acc, total) => acc * total))
    case division: Division =>
      CalculateVisitor(
        CalculateVisitor(0d).visit(division.leftFunctionComponent).totalValue
          / CalculateVisitor(0d).visit(division.rightFunctionComponent).totalValue)
    case power: Power =>
      CalculateVisitor(
        pow(CalculateVisitor(0d).visit(power.leftFunctionComponent).totalValue
          ,CalculateVisitor(0d).visit(power.rightFunctionComponent).totalValue))
    case subtraction: Subtraction =>
      CalculateVisitor(
        CalculateVisitor(0d).visit(subtraction.leftFunctionComponent).totalValue
          - CalculateVisitor(0d).visit(subtraction.rightFunctionComponent).totalValue)
    case abs: Abs =>
      CalculateVisitor(CalculateVisitor(0d).visit(abs.functionComponent).totalValue.abs)