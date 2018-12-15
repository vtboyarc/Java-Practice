class SuperHero(val name: String, val nickname: String, val birthPlace: String,
                val gender: Char) {
  println("A new hero was created " + name)

  def this(name: String){
    this(name, "", "", ' ')
  }

  def this(name: String, birthPlace: String) {
    this(name, "", birthPlace, ' ')
  }
  def details() = {
    println(name + " was born in " + birthPlace)

  }

  var heroAge = 0

  def age = heroAge

  def age_=(newAge: Int): Unit = {
    if (newAge > heroAge)
      heroAge = newAge
    else
      heroAge
  }
}
