package composite.component

import composite.FunctionComponent
import util.variable_input_method.VariableInputMethod

case class VariableComponent(name:String, variableInputMethod: VariableInputMethod) extends FunctionComponent:
  def calculate: Double =
    variableInputMethod.receiveVariableValue(name:String)

  def getVariables:List[VariableComponent]=
    List(this)
  def showFunction: String =
    name
  
    