package com.franklinchen

import org.scalatest.WordSpec

class ManyTest extends WordSpec {
  "A bunch of generated ScalaTest tests" should {
    Seq(1, 2, 3, 4, 5, 6) foreach {
      i =>
      ("test each integer " + i + " for oddness") in {
        assert(i % 2 === 1)
      }
    }
  }
}
