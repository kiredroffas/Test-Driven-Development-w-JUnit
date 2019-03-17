import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdvancedTest {
    /*  === STEP 9 ===
        Test 9: Call Top on a MyStack with no elements. A top call on an empty
        stack should return an error message and not a stack value.
    */
    @Test
    public void topEmptyStack() {
        MyStack newStack = new MyStack();
        int topOfStack = newStack.top();  //stack should be empty and return -9683 (error code)
        assertEquals(topOfStack,-9683);
    }

    /*  === STEP 10 ===
        Test 10:  Push a number to a MyStack that is full. Since the stack array
        can only hold 10 values, if you push an 11th value it should promt an
        error message, not push the number, and return; instead of throwing an exception
        (due to the error checking). Calling top() should return the 10th value entered.
    */
    @Test
    public void pushFullStack() {
        MyStack newStack = new MyStack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);
        newStack.push(8);
        newStack.push(9);
        newStack.push(10);  //Stack array has only 10 spaces
        newStack.push(11);  //11th push should promt an error message instead of an exception
        assertEquals(newStack.top(),10); //top of stack should be 10th value entered (10)
    }

    /*  === STEP 11 ===
        Test 11 (self-defined): Push 11 numbers to a MyStack (only first 10 will
        be entered into the stack, error message should appear), pop 11 times
        (only 10 values will pop and error message should appear), and then push
        a final 3 values and verify that the top of the stack is the number that
        was pushed 3rd. This will test the stack's stability.
    */
    @Test
    public void maxPushPop() {
        MyStack newStack = new MyStack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);
        newStack.push(8);
        newStack.push(9);
        newStack.push(10);  //Stack array has only 10 spaces
        newStack.push(11);  //11th push should promt an error message
        int num1 = newStack.pop();  //should pop 10
        int num2 = newStack.pop();  //should pop 9
        int num3 = newStack.pop();  //should pop 8
        int num4 = newStack.pop();  //should pop 7
        int num5 = newStack.pop();  //should pop 6
        int num6 = newStack.pop();  //should pop 5
        int num7 = newStack.pop();  //should pop 4
        int num8 = newStack.pop();  //should pop 3
        int num9 = newStack.pop();  //should pop 2
        int num10 = newStack.pop(); //should pop 1
        int num11 = newStack.pop(); //11th pop should promt error message
        newStack.push(1);  //Push a final 3 values
        newStack.push(2);
        newStack.push(3);
        int numTop = newStack.top();  //top should be 3
        assertEquals(numTop,3);
    }
}
