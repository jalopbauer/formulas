package composite.composite

import composite.FunctionComponent

trait TwoComponentListFunction(leftFunctionComponents: List[FunctionComponent], rightFunctionComponents: List[FunctionComponent]) 
  extends FunctionComponent:
  def combineFunctionComponents: List[FunctionComponent] =
    leftFunctionComponents ++ rightFunctionComponents
