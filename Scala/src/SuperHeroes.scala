object SuperHeroes {
  def main(args: Array[String]): Unit = {
    println("Hello World")

  val superman = new SuperHero("superman", "clark kent", "krypton", 'M')

    val batman = new SuperHero("batman")

    val spiderman = new SuperHero("spiderman", "new york")

    val hulk = new SuperHero("hulk", "robert", "ohio", 'M')

    hulk.age = 30
    println(hulk.age)

    case class PowerStats(strength: Int, speed: Int)

    val wonderwoman = PowerStats(97, 78)

    val thor = PowerStats(100, 80)

    def findHero(power: PowerStats) = power match {
      case PowerStats(100, 80) => "thor"
      case PowerStats(97, 78) => "wonder woman"
      case PowerStats(_, _) => "Match was not found"
    }

    val hero = findHero(PowerStats(100, 80))

    println(hero)

    val loki = new Villain("Loki", "Asgard")
    loki.details()
    loki.age = 26
  }
}
