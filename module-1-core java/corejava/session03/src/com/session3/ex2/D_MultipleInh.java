package com.session3.ex2;

//interface A{
//	public static final int i=8;
//	void foo();
//}
//interface B{
//	public static final int i=88;
//	void foo();
//}
//class M implements A, B{
//	
//	@Override
//	public void foo() {
//	  System.out.println(A.i);
//	}
//}
//till java 7 interface is 100% abs

class A{
	public static final int i=8;
	public void foo() {
		System.out.println("foo method is overriden");
	}
}
interface B{
	public static final int i=88;
	void foo();
}
class M extends A implements B{
	
	@Override
	public void foo() {
		super.foo();
	  System.out.println(A.i);
	}
}

public class D_MultipleInh {
	
	public static void main(String[] args) {
		M m=new M();
		m.foo();
	}

}
