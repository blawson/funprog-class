package week6

object test {

	val xs = Array(1, 2, 3, 44)               //> xs  : Array[Int] = Array(1, 2, 3, 44)
	xs map (x => x * 2)                       //> res0: Array[Int] = Array(2, 4, 6, 88)
	
	val s = "Hello World"                     //> s  : String = Hello World
	s filter (c => c.isUpper)                 //> res1: String = HW
	
	s exists (c => c.isUpper)                 //> res2: Boolean = true
	s forall (c => c.isUpper)                 //> res3: Boolean = false
	
	// Zip adds elements together from different seqeunces
	val pairs = List(1, 2, 3) zip s           //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
	// split sequnces of pairs into two sequences of lists
	pairs unzip                               //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
	
	s flatMap (c => List('.', c))             //> res5: String = .H.e.l.l.o. .W.o.r.l.d
	
	xs.sum                                    //> res6: Int = 50
}