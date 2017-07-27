package com.franklinchen

import org.specs2._
import org.specs2.specification.core.Fragments

class ManyAcceptanceSpec extends Specification {
  def is = {
    p ^ "A bunch of generated immutable specs2 tests should" ^ br ^
      Fragments.foreach(Seq(1, 3, 5)) { i =>
        testInt(i) ^ br
      }
  }

  def testInt(i: Int) =
    s"test each integer $i for oddness" ! {
      i % 2 ==== 1
    }
}
