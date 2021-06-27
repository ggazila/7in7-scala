package day1

import java.text.DateFormat._
import java.util.{Date, Locale}

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
