package composite.composite

import composite.FunctionComponent
import composite.component.VariableComponent

trait TwoComponentsFunction(leftFunctionComponent: FunctionComponent, rightFunctionComponent: FunctionComponent)
  extends FunctionComponent:

  def getVariables:List[VariableComponent] =
    leftFunctionComponent.getVariables ++ rightFunctionComponent.getVariables