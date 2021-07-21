package katas

import scala.annotation.tailrec

// id:55bf01e5a717a0d57e0000ec
object Multiplication {

  def persistence(n: Int, count: Int = 0): Int =
    if (n < 10)
      count
    else
      persistence(n.toString.split("").map(_.toInt).product, count + 1)
}
