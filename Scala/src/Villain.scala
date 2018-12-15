class Villain(name: String, birthPlace: String) extends SuperHero(name: String,
  birthPlace: String) {

  println("A villain was created")

  override def details(): Unit = {
    println(name + " is a villain")
  }
}
