package StackAndQue;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo4 {
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack.push(1);
		stack.push(5);
		stack.push(4);
		Iterator<Integer> iter = stack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		/*
		 * Stack if Top = -1 --> Stack is Empty
		 * Stack if Top = 0 ---> Stack Has one Element
		 * Stack if Top = N-1 ---> Stack is Full
		 * Stack if Top = N ---> Stack is OverFlow
		 */
	}

}
