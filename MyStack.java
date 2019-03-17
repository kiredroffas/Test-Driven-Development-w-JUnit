/*  Erik Safford
    CS 320 - Assignment 1: Implement Stack using TDD and JUnit
    AUGUST 2018
    Instructor: Xinghui Zhao

    This program implements a stack using an integer array called stackArray. The stack has methods for IsEmpty, push(),
    pop(), and top(). The maximum size of the stack is 10, although this could be changed by modifying the size of the
    stackArray and the corresponding error checking in the push() method. An int called stackPtr is used to keep track
    of the top of the stack. It initially equals -1 to represent that the stack is empty and increases/decreases with
    each push()/pop() of the stack. Error checking is in place to prevent empty stacks being popped and full stacks
    being pushed, returns -9863 on error therefore the number cannot be stored in the stack.
*/
public class MyStack {

    /*  === STEP 1 ===
        Implemented stack array to hold values pushed onto the stack.
        Implemented stack pointer to keep track of the top of the stack.
        Made an IsEmpty() method that checks the stack pointer.
    */
    private int stackArray[] = new int[10]; //Max size of stack is 10
    private int stackPtr = -1;  //Points to the top of the stack, -1 = empty

    public boolean IsEmpty() {  //Checks to see if the stack is empty
        if(stackPtr == -1) {  //-1 = empty
            System.out.println("Stack is empty!");
            return(true);
        }
        System.out.println("Stack contains values!");
        return(false);
    }

    /*  === STEP 2 ===
        Made a push() method to add numbers into the stack array.
        Each time a number is pushed onto the stack, the stackPtr
        increments to represent the stack change in the array.
        The new number is then added to the 'top' of the stackArray.

        === STEP 10 ===
        Made an if statement at the beginning of the push() method to check if the
        stack is full (based on the stackPtr), if full it prints an error message
        and returns without pushing anything (would normally throw an exception).
    */
    public void push(int number) {  //Pushes a number onto the stack
        if(stackPtr > 8) {  //If stackPtr is 9, the stack is filled with 10 values
            System.out.println("The stack is full, cannot push anymore!");
            return;
        }
        stackPtr++;  //Increment the stackPtr to next spot in array
        stackArray[stackPtr] = number; //Set the top of the stack to the 'number'
        System.out.println(number + " pushed");
    }

    /*  === STEP 3 ===
        Made a pop() method to remove numbers off the top of the stack array.
        By decrementing the stackPtr, the top of the stack (array) is effectively
        removed.

        === STEP 4 ===
        Changed the pop() method to return the number at the top of the stack (int)
        that it just popped instead of returning void.

        === STEP 5 ===
        No changes.

        === STEP 6 ===
        Added an if statement in the pop() method to check if the stack is empty before popping.
    */

    public int pop() {  //Pops a number off of the top of the stack,returns number popped
                        //Checks if stack is empty
        if(stackPtr == -1) {
            System.out.println("Error, cannot pop an empty stack!");
            return(-9863); //-9863 = error code
        }
        int topStackNum = stackArray[stackPtr];
        System.out.println(topStackNum + " popped");
        stackPtr--; //Decrement the stackPtr, 'popping' off the top of the stack
        return(topStackNum);
    }

    /*
        === STEP 7 ===
        Made a top() method that prints out the value at the top of the stack array.

        === STEP 8 ===
        Made the top() method return the value of the top of the stack (int).

        === STEP 9 ===
        Added an if statement to check if the stack is empty before top() is ran.
        If the stack is empty and top() is called an error message is printed and
        returned. I used -9683 (random large negative number) to avoid potential bugs
        if the user stores smaller negatives in the stack (-1, -2, -3, ...). Did
        the same in the pop() method.

        === STEP 11 ===
        No structural changes, added documentation and comments.
    */
    public int top() { //Prints and returns the value at the top of the stack (determined by stackPtr)
        if(stackPtr == -1) { //If stack is empty return error code
            System.out.println("Error, cannot print top of empty stack.");
            return(-9683);  //Random large negative so not confused with -1
        }
        int topOfStack = stackArray[stackPtr];
        System.out.println("Top of Stack is " + topOfStack);
        return(topOfStack);
    }
}
