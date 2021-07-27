package katas

import munit.FunSuite

class DivisorsTest extends FunSuite {

  test("should return 1 for 1") {
    assertEquals(Divisors.divisors(1), 1)
  }

  test("should return 2 for 2") {
    assertEquals(Divisors.divisors(2), 2)
  }

  test("should work for higher numbers") {
    assertEquals(Divisors.divisors(5), 2)
    assertEquals(Divisors.divisors(12), 6)
    assertEquals(Divisors.divisors(30), 8)
  }

}
