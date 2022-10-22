package composite

import component.VariableComponent
trait FunctionComponent:
  def calculate:Double

  def getVariables:List[VariableComponent]
  def showFunction: String