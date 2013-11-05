package week5

object listfun {
	val nums = List(2, -4, 5, 7, 1)           //> nums  : List[Int] = List(2, -4, 5, 7, 1)
	val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
	nums filter (x => x > 0)                  //> res0: List[Int] = List(2, 5, 7, 1)
	nums filterNot (x => x > 0)               //> res1: List[Int] = List(-4)
	nums partition (x => x > 0)               //> res2: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
	
	// only takes elements up until the predicate is false, then stops
	nums takeWhile (x => x > 0)               //> res3: List[Int] = List(2)
	// drops the first element, which satisfies the predicate, and stops at the first element that doesn't
	nums dropWhile (x => x > 0)               //> res4: List[Int] = List(-4, 5, 7, 1)
	
	// combine list elements that are identical into lists and return them as a list
	def pack[T](xs: List[T]): List[List[T]] = xs match {
		case Nil => Nil
		case x :: xs1 =>
			val (first, rest) = xs span (y => y == x)
			first :: pack(rest)
	}                                         //> pack: [T](xs: List[T])List[List[T]]
	
	val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)
	
	pack(data)                                //> res5: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
	// return a list of the elements in a list and the length of the similar numbers together
  def encode[T](xs: List[T]): List[(T, Int)] =
		pack(xs) map (ys => (ys.head, ys.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]
	encode(data)                              //> res6: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
}