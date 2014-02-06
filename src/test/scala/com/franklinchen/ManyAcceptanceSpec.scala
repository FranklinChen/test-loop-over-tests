package com.franklinchen

import org.specs2._
import org.specs2.specification.Fragments

class ManyAcceptanceSpec extends Specification { def is = s2"""
  A bunch of generated specs2 tests $e1
  """

  // Not as clean as the unit-style way.
  def e1 = {
    Seq(1, 3, 5).
      foldLeft("A bunch of generated specs2 tests should": Fragments) {
        (res, i) =>
        res ^
        "test each integer " + i + " for oddness" !
        { i % 2 ==== 1 }
      }
  }
}
