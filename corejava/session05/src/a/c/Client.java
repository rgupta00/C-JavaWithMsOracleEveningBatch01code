package a.c;
import a.b.*;
//what is the diff bw protected and default
/*
 * 	the only diff bw the protected and default is 
 * that protected data/method is accessable to other package(package a.c;) iff 
 * 	that class subclass that class
 */
public class Client extends A{

	public static void main(String[] args) {
		Client client=new Client();
		client.fooProtected();
		client.fooPublic();
		System.out.println(client.k);
		System.out.println(client.l);
		
//		A a=new A();
//		a.fooPublic();
//		System.out.println(a.l);
	}
}
