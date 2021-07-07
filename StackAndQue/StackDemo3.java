package StackAndQue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo3 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		pushElement(stack, 21);
		pushElement(stack, 1000);
		pushElement(stack, 0);
		popElement(stack);
		popElement(stack);
		popElement(stack);
		//popElement(stack);
	
		try {
			popElement(stack);
		}catch (EmptyStackException e) {
			System.out.println("Stack is Empty");
		}
		getStack(stack);

	}
	static void pushElement(Stack<Integer> stack, int x) {
		Integer obj = (Integer)x;
		stack.push(obj);
		System.out.println("PUSH-> "+obj);
	}
	static void popElement(Stack<Integer> stack) {
		Integer c = (Integer)stack.pop();
		System.out.println("POPPED OUT<- "+c);
		
	}
	static void getStack(Stack<Integer> stack) {
		System.out.println(stack);
	}

}
