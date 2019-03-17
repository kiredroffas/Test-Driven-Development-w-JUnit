This project helped to practice Test-Driven Development using Java and JUnit. The following tests were created using the TDD methodology:

1. You may not write production code until you have written a failing unit test
2. You may not write more of a unit test than is sufficient to fail
3. You may not write more production code than is sufficient to pass the currently failing test.

This program uses JUnit and Java to implement a bounded stack, named MyStack, using an integer array.
The three basic operations of a traditional stack are push, pop, and top.

Basic Test: JUnit test class, this class is for testing/implementing basic operations of a bounded stack.

1. Create a MyStack and verify that IsEmpty is true.
2. Push a number on the MyStack and verify that IsEmpty is false.
3. Push a number, Pop the number, and verify that IsEmpty is true.
4. Push a number, remember what it is; Pop the number, and verify that the two numbers are equal.
5. Push three numbers, remember what they are; Pop each one, and verify that they are removed in the correct order.
6. Pop a MyStack that has no elements.
7. Push a number and then call Top. Verify that IsEmpty is false.
8. Push a number, remember what it is; and then call Top. Verify that the number that is returned is the same as the
   one that was pushed.

Advanced Test: JUnit test class, Now that a bounded stack using TDD is implemented, test for special cases.

1. Call Top on a MyStack with no elements.
2. Push a number to a MyStack that is full (hint: you may throw an exception here).
3. A self-defined, new test case (it can be anything, e.g., performance test).

Aggregating Tests in Suite:
Now that two test classes are created, combine them to make a test suite. When you run this
test suite, all test cases in both classes should be executed automatically (@RunWith annotation).

