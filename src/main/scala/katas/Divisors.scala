package katas
// id:542c0f198e077084c0000c2e
object Divisors {

  def divisors(n: Int): Int =
    (1 to (n / 2)).count(n % _ == 0) + 1

}
