package com.oracle.session05.ex1;

public class ClientApi {
	
	public static void main(String[] args) {
		//Client i want to use stack create by 2 dev

		
		Stack stack=new StackIArraympl(5);
		stack.push(4);
		stack.push(64);
		stack.push(40);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
