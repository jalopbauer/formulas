package composite.composite.implementation

import composite.FunctionComponent
import composite.component.VariableComponent
import composite.composite.CommutativeFunctionOneComponentListFunction

case class Sum(functionComponents: List[FunctionComponent])
  extends CommutativeFunctionOneComponentListFunction(functionComponents: List[FunctionComponent]):
  def calculate: Double =
    functionComponents.foldLeft(0d)((acc, functionComponent) => acc + functionComponent.calculate)