package visitor.visitor.implementation

import visitor.component.VariableComponent
import visitor.visitor.FunctionVisitor
import visitor.component.*

case class GetVariablesVisitor(variableComponentList: List[VariableComponent]) extends FunctionVisitor():
  def visit(functionComponent:FunctionComponent): GetVariablesVisitor = functionComponent match
    case variableComponent: VariableComponent => GetVariablesVisitor(variableComponent :: variableComponentList)
    case _: NumberComponent => GetVariablesVisitor(List())
    case sum: Sum =>
      GetVariablesVisitor(variableComponentList ++ helperFunction(sum.functionComponents))
    case multiplication: Multiplication =>
      GetVariablesVisitor(variableComponentList ++ helperFunction(multiplication.functionComponents))
    case division: Division =>
      GetVariablesVisitor(variableComponentList
        ::: GetVariablesVisitor(List()).visit(division.leftFunctionComponent).variableComponentList
        ::: GetVariablesVisitor(List()).visit(division.leftFunctionComponent).variableComponentList)
    case power: Power =>
      GetVariablesVisitor(variableComponentList
        ::: GetVariablesVisitor(List()).visit(power.leftFunctionComponent).variableComponentList
        ::: GetVariablesVisitor(List()).visit(power.leftFunctionComponent).variableComponentList)
    case subtraction: Subtraction =>
      GetVariablesVisitor(variableComponentList
        ::: GetVariablesVisitor(List()).visit(subtraction.leftFunctionComponent).variableComponentList
        ::: GetVariablesVisitor(List()).visit(subtraction.leftFunctionComponent).variableComponentList)
    case abs: Abs =>
      GetVariablesVisitor(List()).visit(abs.functionComponent)

  def helperFunction(variableComponentList: List[FunctionComponent]):List[VariableComponent]=
    variableComponentList.flatMap(component => GetVariablesVisitor(List()).visit(component).variableComponentList)