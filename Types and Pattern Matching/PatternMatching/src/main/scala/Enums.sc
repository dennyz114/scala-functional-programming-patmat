/*trait Expr
object Expr:
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr*/
/*pure data definitions like this are called ADTs*/

/*import Expr.*

Number*/

/*Expr.Number*/




/*ADTs as enums*/
enum Expr:
  case Number(n: Int)
  case Sum(e1: Expr, e2: Expr)
end Expr

def show(e: Expr): String = e match
  case Expr.Number(n) => n.toString
  case Expr.Sum(e1, e2) => s"${show(e1)} + ${show(e2)}"


enum Direction(val dx: Int, val dy: Int):
  case Right extends Direction(1, 0)
  case Up extends Direction(0, 1)
  //..

  def leftTurn = Direction.values((ordinal + 1) % 4)
end Direction

val r = Direction.Right
val u = r.leftTurn
val v = (u.dx, u.dy)


//-------
enum Card:
  case Visa, Mastercard, Amex

enum PaymentMethod:
  case CreditCard(kind: Card, holder: String, number: Long)
  case PayPal(email: String)
  case Cash
