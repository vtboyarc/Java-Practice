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
      val avengers = Map("Iron man" -> 12, "Black widow" -> 18, "Batman" -> 8)

      // this is using an anonymous function that is doing the same as if we
      // were to call the updateRankings function
      val newRankings = avengers.values.map((x: Int) => x - 3)
      newRankings.foreach(println)
  }
}