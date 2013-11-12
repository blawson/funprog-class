package week6

object forfun {

	def mapFun[T, U](xs: List[T], f: T => U): List[U] =
		for (x <- xs) yield f(x)          //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
	
	def flatMap[T, U](xs: List[T], f: T => Iterable[U]) =
		for (x <- xs; y <- f(x)) yield y  //> flatMap: [T, U](xs: List[T], f: T => Iterable[U])List[U]
		
	def filter[T](xs: List[T], p: T => Boolean): List[T] =
		for (x <- xs if p(x)) yield x     //> filter: [T](xs: List[T], p: T => Boolean)List[T]
	
	mapFun(List(1,2,3), (x: Int) => x * x)    //> res0: List[Int] = List(1, 4, 9)
	
	// Similar to exercise from the pairs.sc worksheet
	def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
                                                  //> isPrime: (n: Int)Boolean
	// Using the for syntax
	def primesWithFor(n: Int) =
		for {
			i <- 1 until n
			j <- 1 until i
			if isPrime(i + j)
		} yield (i, j)                    //> primesWithFor: (n: Int)scala.collection.immutable.IndexedSeq[(Int, Int)]
	
	// But re-written with explicit translations
	def primesWithTranslations(n: Int) =
		(1 until n).flatMap(i =>
			(1 until i).withFilter(j => isPrime(i + j))
				.map(j => (i, j)))//> primesWithTranslations: (n: Int)scala.collection.immutable.IndexedSeq[(Int, 
                                                  //| Int)]
  // These are identical outputs
	primesWithFor(5)                          //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3))
 	primesWithTranslations(5)                 //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3))
}