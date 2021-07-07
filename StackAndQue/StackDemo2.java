package StackAndQue;

import java.util.Stack;

public class StackDemo2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		boolean isempty= stack.isEmpty();
		System.out.println("Is stack is empty? "+isempty);
		stack.push("Ma");
		isempty = stack.isEmpty();
		System.out.println("----------------------------------Ater Pushing------------------------------------------");
		System.out.println("Is Stack is empty? "+isempty);
		stack.empty();
		System.out.println("----------------------------------After empty() Method----------------------------------");
		isempty = stack.isEmpty();
		System.out.println("Is Stack is empty? "+isempty);
		System.out.println();
		System.out.println(stack.empty());
	}

}
