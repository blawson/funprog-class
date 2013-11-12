package week6

object sortgroup {

	val fruit = List("apple", "pear", "orange", "pineapple")
                                                  //> fruit  : List[String] = List(apple, pear, orange, pineapple)
	fruit sortWith (_.length < _.length)      //> res0: List[String] = List(pear, apple, orange, pineapple)
	fruit.sorted                              //> res1: List[String] = List(apple, orange, pear, pineapple)
	
	fruit groupBy (_.head)                    //> res2: scala.collection.immutable.Map[Char,List[String]] = Map(p -> List(pear
                                                  //| , pineapple), a -> List(apple), o -> List(orange))
}