import org.junit.Test;

import static org.junit.Assert.*;

public class BasicTest {

    /*  === STEP 1 ===
        Test 1: Create a MyStack and verify that IsEmpty is true.
        The stack should be empty when it is first initialized.
    */
    @Test
    public void isStackEmpty() {
        MyStack newStack = new MyStack();
        assertTrue(newStack.IsEmpty());
    }

    /*  === STEP 2 ===
        Test 2: Push a number on the MyStack and verify that IsEmpty is false.
        Once a number is pushed onto the stack, it should no longer be empty.
    */
    @Test
    public void pushStackEmpty() {
        MyStack newStack = new MyStack();
        newStack.push(8);
        assertFalse(newStack.IsEmpty());
    }

    /*  === STEP 3 ===
        Test 3: Push a number, Pop the number, and verify that IsEmpty is true.
        If a number is pushed and then popped the stack should be empty.
    */
    @Test
    public void pushPopEmpty() {
        MyStack newStack = new MyStack();
        newStack.push(12);
        int whatGotPopped = newStack.pop(); //whatGotPopped never used
        assertTrue(newStack.IsEmpty());
    }

    /*  === STEP 4 ===
        Test 4: Push a number, remember what it is; Pop the number, and verify
        that the two numbers are equal. If you push a number, then the same
        number should be popped.
    */
    @Test
    public void pushPopEqual() {
        MyStack newStack = new MyStack();
        newStack.push(24);
        int pushNum = 24;
        int whatGotPopped = newStack.pop();
        assertEquals(pushNum, whatGotPopped);
    }

    /*  === STEP 5 ===
    Test 5: Push three numbers, remember what they are; Pop each one, and verify
    that they are removed in the correct order. If three numbers are pushed, then
    three pops should return the three numbers in reverse order.
    */
    @Test
    public void threePushPop() {
        MyStack newStack = new MyStack();
        newStack.push(1);   //Pushes as 1,2,3
        newStack.push(2);   //   3<-top    should pop as 3,2,1
        newStack.push(3);   //   2
        int num1 = 1;               //   1<-bottom
        int num2 = 2;               //  ___
        int num3 = 3;
        int whatPoppedFirst = newStack.pop();
        int whatPoppedSecond = newStack.pop();
        int whatPoppedThird = newStack.pop();
        assertEquals(whatPoppedFirst,num3); // 1st pop should return 3
        assertEquals(whatPoppedSecond,num2);// 2nd pop should return 2
        assertEquals(whatPoppedThird,num1); // 3rd pop should return 1
    }

    /*  === STEP 6 ===
    Test 6: Pop a MyStack that has no elements. If a stack with no values
    is popped, it promt return an error (-9683) and not decrement the stack.
    */
    @Test
    public void popEmptyStack() {
        MyStack newStack = new MyStack();
        int whatGotPopped = newStack.pop(); //popping an empty stack should return -9683 (error)
        assertEquals(whatGotPopped,-9863);
    }

    /*  === STEP 7 ===
    Test 7: Push a number and then call Top. Verify that IsEmpty is false.
    If you push a number onto the stack, is should not be empty.
    */
    @Test
    public void pushIsStackEmpty() {
        MyStack newStack = new MyStack();
        newStack.push(10);
        int topOfStack = newStack.top();  //Pushed a value so
        assertFalse(newStack.IsEmpty());  //IsEmpty should be false
    }

    /*  === STEP 8 ===
    Test 8: Push a number,remember what it is; and then call Top.
    Verify that the number that is returned is the same as the one that was pushed.
    */
    @Test
    public void pushTopMatch() {
        MyStack newStack = new MyStack();
        newStack.push(30);  //push 30
        int pushNum = 30;
        int topOfStack = newStack.top();  //top of stack should be 30
        assertEquals(pushNum,topOfStack);
    }
}
