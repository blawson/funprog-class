package week7

object streamrange {

	def streamRange(lo: Int, hi: Int): Stream[Int] = {
		print(lo+ " ")
		if (lo >= hi) Stream.empty
		else Stream.cons(lo, streamRange(lo + 1, hi))
	}                                         //> streamRange: (lo: Int, hi: Int)Stream[Int]
	
	streamRange(1, 10).take(3).toList         //> 1 2 3 res0: List[Int] = List(1, 2, 3)
}