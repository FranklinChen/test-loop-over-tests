package com.franklinchen

import org.scalatest.wordspec.AnyWordSpec

class ManyTest extends AnyWordSpec {
  "A bunch of generated ScalaTest tests" should {
    Seq(1, 3, 5).foreach(testInt)
  }

  def testInt(i: Int) =
    s"test each integer $i for oddness" in {
      assert(i % 2 === 1)
    }
}
