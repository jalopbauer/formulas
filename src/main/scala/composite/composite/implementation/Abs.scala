package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.SingleComponentFunction

case class Abs(functionComponent: FunctionComponent)
  extends SingleComponentFunction(functionComponent: FunctionComponent):
  def calculate: Double =
    functionComponent.calculate.abs