package week6

object forfun {

	def mapFun[T, U](xs: List[T], f: T => U): List[U] =
		for (x <- xs) yield f(x)          //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
	
	def flatMap[T, U](xs: List[T], f: T => Iterable[U]) =
		for (x <- xs; y <- f(x)) yield y  //> flatMap: [T, U](xs: List[T], f: T => Iterable[U])List[U]
		
	def filter[T](xs: List[T], p: T => Boolean): List[T] =
		for (x <- xs if p(x)) yield x     //> filter: [T](xs: List[T], p: T => Boolean)List[T]
	
	mapFun(List(1,2,3), (x: Int) => x * x)    //> res0: List[Int] = List(1, 4, 9)
}