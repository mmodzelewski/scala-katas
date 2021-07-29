package katas

// id:54d512e62a5e54c96200019e
object PrimeDecomposition {

  def factors(m: Int): String = {
    factors(List(m), List.empty)
      .groupBy(identity)
      .view.mapValues(_.size)
      .toList
      .sortBy(_._1)
      .map(printTuple)
      .mkString
  }

  private def factors(toDo: List[Int], decomposed: List[Int]): List[Int] =
    if (toDo.isEmpty)
      decomposed
    else if (isPrime(toDo.head))
      factors(toDo.tail, toDo.head :: decomposed)
    else {
      val (a, b) = divide(toDo.head)
      factors(a :: b :: toDo.tail, decomposed)
    }

  private def divide(value: Int): (Int, Int) =
    (2 to value).find(value % _ == 0) match {
      case Some(divisor) => (value / divisor, divisor)
      case None => (value, 1)
    }

  private def isPrime(m: Int): Boolean =
    !(2 until m).exists(m % _ == 0)

  private def printTuple(tuple: (Int, Int)): String =
    tuple match {
      case (key, 1) => s"($key)"
      case (key, number) => s"($key**$number)"
    }

}
