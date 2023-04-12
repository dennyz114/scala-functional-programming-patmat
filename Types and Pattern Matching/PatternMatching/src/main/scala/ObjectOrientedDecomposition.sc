trait Expr:
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  def eval: Int

class Number(val n: Int) extends Expr:
  def isNumber = true
  def isSum = false
  def numValue = n
  def leftOp = throw Error("Number.leftOp")
  def rightOp = throw Error("Number.rightOp")
  def eval: Int = n

class Sum(e1: Expr, e2: Expr) extends Expr:
  def isNumber = false
  def isSum = true
  def numValue = throw Error("Sum.numValue")
  def leftOp = e1
  def rightOp = e2
  def eval: Int = e1.eval + e2.eval

/*ObjectOriented Decomposition: mixes data and operations for the data*/
/*a bit more safe than decomposition, but has limitations (only works for operations in the object)*/
