package katas
// id:54c27a33fb7da0db0100040e
object Square {

  def isSquare(x: Int): Boolean = {
      math.sqrt(x.toDouble).isWhole
  }

}
