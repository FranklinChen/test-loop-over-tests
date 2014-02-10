package com.franklinchen

import org.specs2._
import org.specs2.specification.Fragments
import scala.collection.GenTraversableOnce

class ManyAcceptanceSpec extends Specification {
  def is = {
    testChunk(
      Seq(1, 3, 5),
      "A bunch of generated specs2 tests should",
      testInt _
    )
  }

  def testChunk[A](
    traversable: GenTraversableOnce[A],
    description: String,
    testOne: A => Fragments): Fragments = {
    traversable.foldLeft(p ^ description ^ p) { (res, a) =>
      res ^ br ^ testOne(a)
    } ^ endp
  }

  def testInt(i: Int) = {
    s"test each integer $i for oddness" ! { i % 2 ==== 1 }
  }
}
