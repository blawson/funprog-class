package week2

object basics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // CBN
  def func1(x: Int): Int = { x * 2 }              //> func1: (x: Int)Int
  
  // Omit braces
  def func2(x: Int): Int = x * 2                  //> func2: (x: Int)Int
  
  // Omit explicit return type - can be inferred here
  def func3(x: Int) = x * 2                       //> func3: (x: Int)Int
  
  // Explicitly ask for CBN
  def func4(x: => Int) = x * 2                    //> func4: (x: => Int)Int
  
	def boolFunc(b: Boolean, x: (Boolean => Int)) = if (b) 0 else x(b)
                                                  //> boolFunc: (b: Boolean, x: Boolean => Int)Int
  
  // Create function as data
  val fun: (Boolean) => Int = (x) => if (x) 1 else boolFunc(x, if (_) 0 else { println("else"); 1 } )
                                                  //> fun  : Boolean => Int = <function1>
  
  // Extra syntax - the '_' anonymises the operation
  val fun2: (Boolean, => Int) => Int = if (_) _ else { println("else"); 0 }
                                                  //> fun2  : (Boolean, => Int) => Int = <function2>
  
  def loop(b: Boolean, x: Int): Int = if (b) 1 else loop(b, x)
                                                  //> loop: (b: Boolean, x: Int)Int/
 
  loop(false, 0)
}
