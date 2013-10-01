package examples

object functions {

	// We define an infinite looping function
	def loop: Int = loop                      //> loop: => Int
	
	// Inifite recurision - def first(x: Int, y: Int) = x
	
	// Force call-by-name on the parameter
	def first(x: Int, y: => Int) = x          //> first: (x: Int, y: => Int)Int
	
	first(1, loop)                            //> res0: Int = 1
}