package katas

import munit.FunSuite

class SquareTest extends FunSuite {

  test("should return false for values lower than 0") {
    assertEquals(Square.isSquare(-4), false)
    assertEquals(Square.isSquare(-1), false)
    assertEquals(Square.isSquare(-12), false)
    assertEquals(Square.isSquare(-129), false)
    assertEquals(Square.isSquare(-16), false)
  }

  test("should return true for 0") {
    assertEquals(Square.isSquare(0), true)
  }

  test("should return true for square values") {
    assertEquals(Square.isSquare(4), true)
    assertEquals(Square.isSquare(16), true)
    assertEquals(Square.isSquare(9), true)
    assertEquals(Square.isSquare(81), true)
  }
  test("should return false for not square values") {
    assertEquals(Square.isSquare(3), false)
    assertEquals(Square.isSquare(15), false)
    assertEquals(Square.isSquare(10), false)
    assertEquals(Square.isSquare(32), false)
  }

}
