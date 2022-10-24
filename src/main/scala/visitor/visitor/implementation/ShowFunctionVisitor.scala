package visitor.visitor.implementation

import visitor.component.VariableComponent
import visitor.visitor.FunctionVisitor
import visitor.component.*

import scala.math.pow

case class ShowFunctionVisitor(functionString:String) extends FunctionVisitor():
  def visit(functionComponent:FunctionComponent): ShowFunctionVisitor = functionComponent match
    case variableComponent: VariableComponent =>
      ShowFunctionVisitor(variableComponent.name)
    case numberComponent: NumberComponent => ShowFunctionVisitor(numberComponent.number.toString)
    case sum: Sum =>
      ShowFunctionVisitor(sum.functionComponents.tail.foldLeft(ShowFunctionVisitor("").visit(sum.functionComponents.head).functionString)((acc, functionComponent) => acc + " + " + ShowFunctionVisitor("").visit(functionComponent).functionString))
    case multiplication: Multiplication =>
      ShowFunctionVisitor(multiplication.functionComponents.tail.foldLeft(ShowFunctionVisitor("").visit(multiplication.functionComponents.head).functionString)((acc, functionComponent) => acc + " * " + ShowFunctionVisitor("").visit(functionComponent).functionString))
    case division: Division =>
      ShowFunctionVisitor(ShowFunctionVisitor("").visit(division.leftFunctionComponent).functionString
        + " / " +
       ShowFunctionVisitor("").visit(division.rightFunctionComponent).functionString)
    case power: Power =>
      ShowFunctionVisitor(ShowFunctionVisitor("").visit(power.leftFunctionComponent).functionString
        + " ^ " +
        ShowFunctionVisitor("").visit(power.rightFunctionComponent).functionString)
    case subtraction: Subtraction =>
      ShowFunctionVisitor(ShowFunctionVisitor("").visit(subtraction.leftFunctionComponent).functionString
        + " - " +
        ShowFunctionVisitor("").visit(subtraction.rightFunctionComponent).functionString)
    case abs: Abs =>
      ShowFunctionVisitor("|" + ShowFunctionVisitor("").visit(abs.functionComponent).functionString + "|")