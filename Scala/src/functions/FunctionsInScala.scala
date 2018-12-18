package functions

import scala.collection.mutable.{LinkedHashSet, Set}

object FunctionsInScala {
  def main(args: Array[String]): Unit = {


    val heroes = Array("Wonder Woman", "Thor", "Superman")

    val lowerCase = (value: String) => value.toLowerCase()

    // prints them out all lower case
    for (elem <- heroes) {
      println(lowerCase(elem))
    }

    // First class functions -- Functions that can be passed around as
    // arguments to other functions or stored in variables
    def updateRankings(x: Int) = x - 3

    // can get same result as above line by using an anonymous function
   // Anonymous functions -- An anonymous function is a function without a function name
    // (x: Int) => x - 3

      // keys and values
      val avengers = Map("Iron Man" -> 12, "Black Widow" -> 18, "Captain America" -> 8,
        "Scarlet Witch" -> 10)


    // this is using an anonymous function that is doing the same as if we
      // were to call the updateRankings function
      val newRankings = avengers.values.map((x: Int) => x - 3)
      newRankings.foreach(println)


    val lHeroes = Array("Wonder Woman", "Thor", "Superman")

    val lHeroes1 = heroes.map(_.toLowerCase())
    lHeroes1.foreach(println)


    val ironManR = avengers.getOrElse("Iron Man", 0)
    val blackWidowR = avengers.getOrElse("Black Widow", 0)
    val captainAmericaR = avengers.getOrElse("Captain America", 0)

    def compare(avenger1: Int, avenger2: Int, avenger3: Int,
                f:(Int, Int, Int) => Int) = f(avenger1, avenger2, avenger3)

    val bestRanked = compare(ironManR, blackWidowR, captainAmericaR, _ min _ min _)
    //    println(bestRanked)

    val worstRanked = compare(ironManR, blackWidowR, captainAmericaR, _ max _ max _)
    println(worstRanked)



    // closures with Scala
    
    var prefix = "Lightning "

    def reverseIt(name: String) = (name + prefix).reverse

    val thor = reverseIt("Thor")

    prefix = " Super Fast "

    val wonderWoman = reverseIt(" Wonder Woman ")

    println(thor)
    println(wonderWoman)

  }
}