package composite.component

import composite.FunctionComponent

case class NumberComponent(number:Double) extends FunctionComponent:
  def calculate:Double =
    number

  def getVariables:List[VariableComponent] =
    List()


  def showFunction:String =
    number.toString