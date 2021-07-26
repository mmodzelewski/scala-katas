package katas
// id:52efefcbcdf57161d4000091 
object Kata {
  def count(string: String): Map[Char, Int] =
    string.toCharArray
      .foldLeft(Map.empty)((acc, char) =>
        acc.updated(char, acc.getOrElse(char, 0) + 1))

}
