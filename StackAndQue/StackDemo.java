package StackAndQue;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(21);
		stack.push(22);
		stack.push(223);
		System.out.println(stack);
		Stack<String>stack2 = new Stack<>();
		stack2.push("Yah");
		stack2.push("N");
		System.out.println(stack2);
	}
}

