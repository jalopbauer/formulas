package visitor.visitor

import visitor.component.*

trait FunctionVisitor():
  def visit(functionComponent:FunctionComponent): FunctionVisitor
