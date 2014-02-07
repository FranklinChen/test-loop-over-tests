package com.franklinchen

import org.specs2._
import org.specs2.specification.Fragments

class ManyAcceptanceSpec extends Specification {
  def is = {
    Seq(1, 3, 5).
      foldLeft(p ^ "A bunch of generated specs2 tests should" ^ p) {
        (res, i) =>
        res ^ br ^ testInt(i)
      } ^ endp
  }

  def testInt(i: Int) = {
    s"test each integer $i for oddness" ! { i % 2 ==== 1 }
  }
}
