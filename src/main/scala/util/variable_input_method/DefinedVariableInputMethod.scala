package util.variable_input_method

case class DefinedVariableInputMethod(value: Double) extends VariableInputMethod:
  def receiveVariableValue(name: String): Double =
    value

