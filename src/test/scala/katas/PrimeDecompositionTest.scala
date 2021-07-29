package katas

import munit.FunSuite

class PrimeDecompositionTest extends FunSuite {

  test("should return 2 for 2") {
    assertEquals(PrimeDecomposition.factors(2), "(2)")
  }

  test("should return 3 for 3") {
    assertEquals(PrimeDecomposition.factors(3), "(3)")
  }

  test("should decompose 4") {
    assertEquals(PrimeDecomposition.factors(4), "(2**2)")
  }

  test("should decompose 86240") {
    assertEquals(PrimeDecomposition.factors(86240), "(2**5)(5)(7**2)(11)")
  }

}
