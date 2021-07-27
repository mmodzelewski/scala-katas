package katas

import munit.FunSuite

class CharactersCountsTest extends FunSuite {

  test("should return empty map for an empty string") {
    assertEquals(Kata.count(""), Map.empty)
  }

  test("should return 1 for a single character string") {
    assertEquals(Kata.count("a"), Map('a' -> 1))
  }

  test("should count mulitple characters") {
    assertEquals(Kata.count("aba"), Map('a' -> 2, 'b' -> 1))
  }

}
