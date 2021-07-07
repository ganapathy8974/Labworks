package week6;

import java.util.List;
import java.util.Stack;

//Topic - collections
//Stack Example 
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.add("Ganu");
		stack.add("Manu");
		stack.add("Vanu");
		
		System.out.println(stack.isEmpty());//This is check Stack is Empty or not.
		System.out.println(stack.peek());// Return top of the Element in stack.
		stack.push("Barath");//This is insect the element in Stack.
		System.out.println(stack);
		System.out.println(stack.search("Ganu"));//This is search the element in stack and return the element's position
	}
}
