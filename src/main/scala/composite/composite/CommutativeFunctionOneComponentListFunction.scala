package composite.composite

import composite.FunctionComponent
import composite.component.VariableComponent

trait CommutativeFunctionOneComponentListFunction(functionComponents: List[FunctionComponent]):
  def getVariables: List[VariableComponent] =
    functionComponents.flatMap(_.getVariables)
