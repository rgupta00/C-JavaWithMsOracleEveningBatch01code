package a.b;

//public class and public method /data can be access in any way in other 
//packages
//default visibality: it is "package private" ie a class ie private to the package
public class A {
	private int i = 9;// withiin the class only A
	int j = 99;
	protected int k = 999;
	public int l = 9999;

	//within the class
	private void fooPrivate() {
		System.out.println("private void fooPrivate() of class A");
	}
	 void fooDefault() {
		System.out.println("void fooDefault() method of class A");
	}
	
	protected void fooProtected() {
		System.out.println("protected void fooProtected()  method of class A");
	}
	
	public void fooPublic() {
		System.out.println("foo public fooPublic() method of class A");
	}
}
