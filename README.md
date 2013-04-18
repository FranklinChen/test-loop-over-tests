## Generating tests for Scala

Often one has a set of data and wants to generate a single test for each item, so that if one fails, then that does not stop execution of the other tests.

This is easy to do with either [ScalaTest](http://www.scalatest.org/) or [specs2](http://etorreborre.github.com/specs2/).

Here are some examples to illustrate.

To run and see the succeeding and failing tests:

```
$ sbt test
```
