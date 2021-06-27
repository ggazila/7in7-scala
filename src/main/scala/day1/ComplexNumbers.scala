package day1

object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("Overridden toString(): " + c.toString)
  }
}
