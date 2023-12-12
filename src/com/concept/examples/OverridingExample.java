package com.concept.examples;
class Parent{
	public void sum(int i) {
		System.out.println("parent class method sum::"+i*i);
	}
	public Object mul(String  i) {
		System.out.println("parent class method mul::"+i+i);
		return i;
	
	}	
	public Number sub(Float number) {
		System.out.println("parent number::"+number);
		return number;
		
	}
	public static void test() {
		System.out.println("parent test method:::");
	}
}
class Child extends Parent{
	public void sum(int i) {
		System.out.println("child class method sum::"+i*i);
	}
	public StringBuffer mul(StringBuffer  i) {
		System.out.println("child class method mul::"+i+i);
		return i;
}
	public final Number sub(Float number) {
		System.out.println("child number::"+number);
		return number;
		
	}
	public static void test() {
		System.out.println("child test method:::");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
	Parent p=new Parent();
	p.sum(20);//parent class method sum::400
	Child c=new Child();
	c.sum(10);//child class method sum::100
	Parent p2=new Child();
	p2.sum(15);//child class method sum::225
	p2.mul(null);
	p2.sub(10.20f);
	p2.test();
	//Child c2=new Parent();parent class object cannot hold in child class reference. 
	

	}

}
