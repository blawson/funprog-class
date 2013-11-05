package week5

object listfun {
	val nums = List(2, -4, 5, 7, 1)           //> nums  : List[Int] = List(2, -4, 5, 7, 1)
	val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
	nums filter (x => x > 0)                  //> res0: List[Int] = List(2, 5, 7, 1)
	nums filterNot (x => x > 0)               //> res1: List[Int] = List(-4)
	nums partition (x => x > 0)               //> res2: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
}