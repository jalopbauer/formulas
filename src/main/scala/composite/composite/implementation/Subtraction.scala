package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.TwoComponentsFunction

case class Subtraction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends TwoComponentsFunction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent):
  def calculate: Double =
    leftFunctionComponent.calculate - rightFunctionComponent.calculate