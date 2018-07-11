package sq;

public class Client<T> {

	// prints the contents of stack of Integers s, in
	// top-to-bottom order. This method may change s
	// temporarily, but by the time it exits, s must be
	// set back to the contents it had when printStack was
	// called.
	public static void printStack(Stack<Integer> s) {
		// Creates a new stack
		Stack<Integer> temp = new Stack<Integer>();

		while (!s.isEmpty()) {
			// sets data to the num contained in the node that is being pop
			int data = s.pop();

			//Prints out the number
			System.out.println(data);
			temp.push(data);
		}

			//resets s to its original list
		while (!temp.isEmpty()) {
			s.push(temp.pop());
		}

	}


    // this method reverses the order of the items in the
    // stack.  What was the top Integer becomes the bottom,
    // next-to-top become next-to-bottom, etc.
	public static void flipStack(Stack<Integer> s){
	    //Creates a new queue
		Queue<Integer> qList = new Queue<Integer>();

			//Moves the numbers from stack to a queue
		while(!s.isEmpty()){
			qList.enqueue(s.pop());
		}

			//Pushes the numbers back into the stack in reverse order
		while(!qList.isEmpty()){
			s.push(qList.dequeue());
		}
	}
}
