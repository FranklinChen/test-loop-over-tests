package com.franklinchen

import org.specs2.mutable._

class ManySpec extends Specification {
  "A bunch of generated specs2 tests" should {
    Seq(1, 3, 5) foreach {
      i =>
      ("test each integer " + i + " for oddness") in {
        i % 2 must_== 1
      }
    }
  }
}
