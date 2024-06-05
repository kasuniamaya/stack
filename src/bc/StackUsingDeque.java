package bc;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> stack = new ArrayDeque<>();
		
		//pushing elements onto the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//popping elements from the stack
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//peek at the pop element without removing it
		System.out.println(stack.peek());
		
		

	}

}
