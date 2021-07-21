package katas

import munit.FunSuite

class PersistentBuggerTest extends FunSuite {

  test("should return 0 for a single digit number") {
    assertEquals(Multiplication.persistence(1), 0)
    assertEquals(Multiplication.persistence(9), 0)
    assertEquals(Multiplication.persistence(0), 0)
  }

  test("should return 1 for 12") {
    assertEquals(Multiplication.persistence(12), 1)
  }

  test("should return correct value for complex examples") {
    assertEquals(Multiplication.persistence(39), 3)
    assertEquals(Multiplication.persistence(25), 2)
    assertEquals(Multiplication.persistence(999), 4)
  }

}
