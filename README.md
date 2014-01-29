## Generating tests for Scala

[![Build Status](https://travis-ci.org/FranklinChen/test-loop-over-tests.png)](https://travis-ci.org/FranklinChen/test-loop-over-tests)

Often one has a set of data and wants to generate a single test for each item, so that if one fails, then that does not stop execution of the other tests.

This is easy to do with either [ScalaTest](http://www.scalatest.org/) or [specs2](http://specs2.org/).

Here are some examples to illustrate.

To run and see the succeeding and failing tests:

```
$ sbt test
```
