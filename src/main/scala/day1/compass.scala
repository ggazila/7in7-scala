class Compass {
  val directions = List("north", "east", "west", "south")
  var bearing = 0

  print("Initial bearing: ")
  println(direction())

  def direction(): String = directions(bearing)

  def inform(turnDirection: String): Unit = {
    println("Turning " + turnDirection + ". Now bearing " + direction())
  }

  def turnRight(): Unit = {
    bearing = (bearing + 1) % directions.size
    inform("right")
  }

  def turnLeft(): Unit = {
    bearing = (bearing + (directions.size - 1)) % directions.size
    inform("left")
  }

}

val compass = new Compass
compass.turnRight()
compass.turnRight()
compass.turnLeft()
compass.turnLeft()
compass.turnLeft()
