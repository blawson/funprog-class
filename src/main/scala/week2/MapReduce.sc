package example

object Excercises {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	def mapReduce(combine: (Int, Int) => Int, f: Int => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(combine, f, zero)(a+1, b))
                                                  //> mapReduce: (combine: (Int, Int) => Int, f: Int => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	  
  def product(f: Int => Int)(a: Int, b: Int): Int =
  	mapReduce((x, y) => x * y, f, 1)(a, b)    //> product: (f: Int => Int)(a: Int, b: Int)Int
		
	product(x => 2*x)(1, 5)                   //> res0: Int = 3840
	
	def factorial(a: Int): Int =
		product(x => x)(1, a)             //> factorial: (a: Int)Int
		
	factorial(5)                              //> res1: Int = 120

	mapReduce((x, y) => x + y, z => 2 * z, 0)(1, 3)
                                                  //> res2: Int = 12
}