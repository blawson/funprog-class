package week4

// Piano numbers
abstract class Nat {
	def isZero: scala.Boolean
	def predecessor: Nat
	def successor: Nat = new Succ(this)
	def + (that: Nat): Nat
	def - (that: Nat): Nat
}

object Zero extends Nat {
  def isZero: scala.Boolean = true
  def predecessor: Nat = throw new IllegalStateException
  def + (that: Nat): Nat = that
  def - (that: Nat): Nat = 
    if (that.isZero) this else throw new IllegalArgumentException
}

class Succ(n: Nat) extends Nat {
  def isZero: scala.Boolean = false
  def predecessor: Nat = n
  def + (that: Nat): Nat = new Succ(n + that)
  def - (that: Nat): Nat = 
    if (that.isZero) this else n - that.predecessor
}