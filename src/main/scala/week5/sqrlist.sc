package week5

object sqrlist {

	def squareList1(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => y * y :: squareList1(ys)
	}                                         //> squareList1: (xs: List[Int])List[Int]
	
	def squareList2(xs: List[Int]): List[Int] =
		xs map (_ ^ 2)                    //> squareList2: (xs: List[Int])List[Int]
		
			
	def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
	}                                         //> posElems: (xs: List[Int])List[Int]
		
	val list = List(1, 2, 3, 4)               //> list  : List[Int] = List(1, 2, 3, 4)
	
	squareList1(list)                         //> res0: List[Int] = List(1, 4, 9, 16)
	squareList1(list)                         //> res1: List[Int] = List(1, 4, 9, 16)

}