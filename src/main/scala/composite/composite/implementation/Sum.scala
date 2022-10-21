package composite.composite.implementation

import composite.FunctionComponent
import composite.composite.TwoComponentListFunction

case class Sum(leftFunctionComponents: List[FunctionComponent], rightFunctionComponents: List[FunctionComponent]) 
  extends TwoComponentListFunction(leftFunctionComponents: List[FunctionComponent], rightFunctionComponents: List[FunctionComponent]):
  def calculate(): Double =
    combineFunctionComponents.foldLeft(0d)((acc, functionComponent) => acc + functionComponent.calculate())