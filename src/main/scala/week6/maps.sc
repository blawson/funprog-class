package week6

object maps {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
  
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  
  capitalOfCountry("US")                          //> res0: String = Washington
  capitalOfCountry get "US"                       //> res1: Option[String] = Some(Washington)
  
  // using the ("Andorra") syntax throws a NoSuchElementException
  capitalOfCountry get "Andorra"                  //> res2: Option[String] = None
  
  // access the Option types
  def showCapital(country: String) = capitalOfCountry.get(country) match {
		case Some(capital) => capital
		case None => "missing data"
	}                                         //> showCapital: (country: String)String
	
	showCapital("Andorra")                    //> res3: String = missing data
	showCapital("US")                         //> res4: String = Washington
}