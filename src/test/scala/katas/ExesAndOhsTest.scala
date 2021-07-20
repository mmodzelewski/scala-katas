package katas

import munit.FunSuite

class ExesAndOhsTest extends FunSuite {

  test("should return false for single x") {
    assertEquals(ExesAndOhs.xo("x"), false)
  }

  test("should return false for single o") {
    assertEquals(ExesAndOhs.xo("o"), false)
  }

  test("should return true for a pair") {
    assertEquals(ExesAndOhs.xo("xo"), true)
  }

  test("should return true for a pair with different caps") {
    assertEquals(ExesAndOhs.xo("Xo"), true)
  }

  test("should ignore other characters") {
    assertEquals(ExesAndOhs.xo("Xeo"), true)
  }

  test("should return true for a long string with equal number of xes an ohs") {
    assertEquals(ExesAndOhs.xo("xxooOxXooxox"), true)
  }

  test("should return false for a long string with unequal number of xes an ohs") {
    assertEquals(ExesAndOhs.xo("xxooOxXooox"), false)
  }

}
