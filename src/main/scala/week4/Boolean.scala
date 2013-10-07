package week4

/**
 * Example of how you would define Boolean from first principles,
 * i.e. no concept of true or false
 */
abstract class Boolean {

  def ifThenElse[T](t: => T, e: => T): T
  
  def && (x: => Boolean): Boolean = ifThenElse(x, False)
  def || (x: => Boolean): Boolean = ifThenElse(True, x)
  
  def unary_! : Boolean = ifThenElse(False, True)
  
  def == (x: Boolean): Boolean = ifThenElse(x, x.unary_!)
  def != (x: Boolean): Boolean = ifThenElse(x.unary_!, x)
  def < (x: Boolean): Boolean = ifThenElse(False, x)
}

object True extends Boolean {
  def ifThenElse[T](t: => T, e: => T): T = t
  
  override def toString = "true"
}

object False extends Boolean {
  def ifThenElse[T](t: => T, e: => T): T = e
  
  override def toString = "false"
}

object Main extends App {
  println(True && False)
  println(True && True)
  println(False && True)
  println(True || False)
  println(False < True)
}
