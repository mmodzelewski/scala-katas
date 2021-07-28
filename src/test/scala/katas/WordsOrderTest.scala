package katas

import munit.FunSuite

class WordsOrderTest extends FunSuite {

  test("should return empty string for empty string"){
    assertEquals(WordsOrder.order(""), "")
  }

  test("should return same string for a string with one word"){
    assertEquals(WordsOrder.order("test1"), "test1")
  }

  test("should sort 2 words"){
    assertEquals(WordsOrder.order("second2 first1"), "first1 second2")
  }

  test("should sort 3 words"){
    assertEquals(WordsOrder.order("second2 third3 first1"), "first1 second2 third3")
  }

  test("should sort regardless of number position"){
    assertEquals(WordsOrder.order("s2econd 3third first1"), "first1 s2econd 3third")
  }

}
