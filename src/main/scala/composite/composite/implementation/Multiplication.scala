package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.CommutativeFunctionOneComponentListFunction

case class Multiplication(functionComponents: List[FunctionComponent])
  extends CommutativeFunctionOneComponentListFunction(functionComponents: List[FunctionComponent]):
  def calculate(): Double =
    functionComponents.foldLeft(1d)((acc, functionComponent) => acc * functionComponent.calculate)