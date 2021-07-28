package katas

import scala.util.matching.Regex
// id:55c45be3b2079eccff00010f
object WordsOrder {

  val numberPattern: Regex = "[0-9]".r

  def order(str: String): String =
    if (str == "")
      return ""
    else
      str.split(" ")
        .map(value => extractNumber(value) -> value)
        .sortBy(_._1)
        .map(_._2)
        .mkString(" ")

  def extractNumber(word: String): Int =
    numberPattern.findFirstMatchIn(word) match {
      case Some(value) => value.group(0).toInt
      case None => 0
    }

}
