package collections

import scala.collection.mutable.ArrayBuffer

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    // an array of ints sized at 10 items
    val numbers = new Array[Int](10)

    //an array of strings sized at 10 items
    val words = new Array[String](10)

    // immutable
    val heroes = Array("wonder woman", "batman", "superman")

    // mutable
    val mutableHeroes = ArrayBuffer("wonder woman", "batman", "superman")

    // adding to it
    mutableHeroes += "Iron man"

    // sets
    // Sets are another type of data structure that do not preserve order
    // Unlike tuples, sets do NOT allow duplicates.
    val setNumbers = Set(1,2,3,4,5)

  }
}
