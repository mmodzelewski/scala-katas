package katas

import munit.FunSuite

class SquareTest extends FunSuite {

  test("should return false for values lower than 0") {
    assertEquals(sol.isSquare(-4), false)
    assertEquals(sol.isSquare(-1), false)
    assertEquals(sol.isSquare(-12), false)
    assertEquals(sol.isSquare(-129), false)
    assertEquals(sol.isSquare(-16), false)
  }

  test("should return true for 0") {
    assertEquals(sol.isSquare(0), true)
  }

  test("should return true for square values") {
    assertEquals(sol.isSquare(4), true)
    assertEquals(sol.isSquare(16), true)
    assertEquals(sol.isSquare(9), true)
    assertEquals(sol.isSquare(81), true)
  }
  test("should return false for not square values") {
    assertEquals(sol.isSquare(3), false)
    assertEquals(sol.isSquare(15), false)
    assertEquals(sol.isSquare(10), false)
    assertEquals(sol.isSquare(32), false)
  }

}
