package katas
// id:55908aad6620c066bc00002a
object ExesAndOhs {

  def xo(str: String): Boolean =
    str
      .toLowerCase
      .filter(c => c == 'x' || c == 'o')
      .map(c => if (c == 'x') 1 else -1).sum == 0

}
