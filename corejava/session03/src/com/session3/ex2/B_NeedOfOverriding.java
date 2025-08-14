package com.session3.ex2;
class KrishnaDairy{
	public void sellMilk() {
		System.out.println("selling fresh but easily spilable milk");
	}
}
class KrishnaDairyImproved extends KrishnaDairy{
	@Override //Annotation aka meta data, i am tellint to the compiler hey pls ensure that overring is done
	public void sellMilk() {
		System.out.println("selling Parushrized mike dont easily spilable milk");
	}
}
class KrishnaDairySuperImproved extends KrishnaDairy{
	@Override //
	public void sellMilk() {
		System.out.println("selling Parushrized mike at the price of ice cream");
	}
}
public class B_NeedOfOverriding {
	public static void main(String[] args) {
		//Overrding provied run time polymorphism?
		KrishnaDairy dairy=new KrishnaDairySuperImproved();
		dairy.sellMilk();
	}

}
