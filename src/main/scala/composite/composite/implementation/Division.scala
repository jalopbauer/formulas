package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.TwoComponentsFunction

case class Division(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends TwoComponentsFunction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent):
  def calculate: Double =
    leftFunctionComponent.calculate / rightFunctionComponent.calculate

  def showFunction: String =
    val leftString = leftFunctionComponent.showFunction
    val rightString = rightFunctionComponent.showFunction
    s"($leftString / $rightString)"