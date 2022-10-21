package composite.component

import composite.FunctionComponent

case class NumberComponent(number:Double) extends FunctionComponent:
  def calculate():Double =
    number
