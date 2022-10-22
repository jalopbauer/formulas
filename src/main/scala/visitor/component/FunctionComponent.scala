package visitor.component

import util.variable_input_method.VariableInputMethod
import visitor.visitor.FunctionVisitor

sealed trait FunctionComponent:
  def accept(visitor: FunctionVisitor): Unit
//
case class Multiplication(functionComponents: List[FunctionComponent])
  extends FunctionComponent :
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)

case class Sum(functionComponents: List[FunctionComponent])
  extends FunctionComponent :
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)
//
case class Division(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent) extends FunctionComponent:
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)

case class Power(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends FunctionComponent :
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)

case class Subtraction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends FunctionComponent :
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)
//
case class Abs(functionComponent: FunctionComponent) extends FunctionComponent:
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)

case class NumberComponent(number:Double) extends FunctionComponent:
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)


case class VariableComponent(name:String, variableInputMethod: VariableInputMethod) extends FunctionComponent:
  def accept(visitor: FunctionVisitor): Unit =
    visitor.visit(this)

