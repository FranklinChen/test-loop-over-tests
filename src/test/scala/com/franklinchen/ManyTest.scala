package com.franklinchen

import org.scalatest.WordSpec

class ManyTest extends WordSpec {
  "A bunch of generated ScalaTest tests" should {
    Seq(1, 3, 5) foreach {
      i =>
      ("test each integer " + i + " for oddness") in {
        assert(i % 2 === 1)
      }
    }
  }
}
