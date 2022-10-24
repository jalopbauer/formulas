package composite.composite

import composite.FunctionComponent
import composite.component.VariableComponent

trait SingleComponentFunction(functionComponent: FunctionComponent) extends FunctionComponent:
  def getVariables:List[VariableComponent] =
    functionComponent.getVariables

