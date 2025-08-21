package com.session06.ex1;

public class StringDemo {

	public static void main(String[] args) {
//		String s="foo";
//		String s1=new String("foo");
//		System.out.println(s.equals(s1));
//		System.out.println(s==s1);//u compare the address in case of == of object
		
//		String s="nitin";
//		String sb=new StringBuilder().append(s).reverse().toString();
//		System.out.println(sb);
		
		//char[]chars=s.toCharArray();
		//apply the loop and revse it :<
		
		String s = "Hello World";
//		s.length();              // 11
//		s.isEmpty();             // false
//		s.isBlank();             // false (Java 11+)
		
//		s.charAt(0);             // 'H'
//		s.indexOf('o');          // 4
//		s.indexOf("World");      // 6
//		s.lastIndexOf('o');      // 7
		
//		s.equals("Hello World");          // true
//		s.equalsIgnoreCase("hello world"); // true
//		s.compareTo("Hello");             // positive (>0)
//		s.compareToIgnoreCase("HELLO WORLD"); // 0
		
//		String s3="gunika gup";
//		String s4="gunika gupta";
//		System.out.println(s4.compareTo(s3));
		
//		String data="i love traveling and teaching and food";
//		String tokens[]=data.split(" ");
//		for(String token : tokens) {
//			System.out.println(token);
//		}
		//regex: data processing ! key topic in python
		//i do have some data => correct email id or not match method of string class
		
		String email1 = "user.name@example.com";
        String email2 = "invalid-email@com";

        // Simple regex for email validation
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        System.out.println(email1.matches(regex)); // true
        System.out.println(email2.matches(regex)); // false
        
		
	}
}
