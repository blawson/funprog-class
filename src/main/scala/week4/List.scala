package week4

import java.util.NoSuchElementException

/** Like interfaces, but can have concrete methods and even parameters **/
trait List[+T] {
	def isEmpty: scala.Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

object Nil extends List[Nothing] {
  def isEmpty = true
  /** Nothing is a type that is a subtype of every / any other type **/
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.head")
}

object List {
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, Nil))
  def apply[T]() = Nil
}

object test {
  
  val x: List[String] = Nil
}