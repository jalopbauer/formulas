package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.TwoComponentsFunction

import scala.math.pow

case class Power(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends TwoComponentsFunction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent):
  def calculate: Double =
    pow(leftFunctionComponent.calculate,rightFunctionComponent.calculate)