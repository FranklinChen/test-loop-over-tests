package com.franklinchen

import org.specs2.mutable._
import org.specs2.specification.core.Fragments

class ManySpec extends Specification {
  "A bunch of generated specs2 mutable tests" should {
    import scala.language.implicitConversions

    Fragments.foreach(Seq(1, 3, 5))(testInt)
  }


  def testInt(i: Int) =
    s"test each integer $i for oddness" in {
      i % 2 === 1
    }
}
