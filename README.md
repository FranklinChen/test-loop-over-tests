# Dynamically generating test cases in Scala test frameworks

![Continuous Integration](https://github.com/FranklinChen/test-loop-over-tests/workflows/Continuous%20Integration/badge.svg)

Often you want to parameterize a test by data, and run all of the tests independently so that any one failure does not step the test run. For example, maybe you have a sequence of integers and want to run a test case for each integer in the sequence.

## A bad solution

One attempted solution is to write *one* test case for the sequence, and inside the test case, sequentially loop over all the items in the sequence and make an assertion for each. The problems with this approach:

- one assertion failure causes a break out of the loop and the whole test case fails
- no parallel running of test cases

## A good solution

We *dynamically* generate a sequence of individual test cases.

- since each data item results in its own test case, its failure does not stop the run of the other test cases
- the test cases can be exercised in *parallel*, in a test framework that allows that

This is easy to do with either [ScalaTest](https://www.scalatest.org/) or [specs2](https://etorreborre.github.io/specs2/).
