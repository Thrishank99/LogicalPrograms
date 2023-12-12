package com.basicjava8.examples;

class Parent {

	public void m1() {
		System.out.println("deault arg method");
	}

	/*
	 * public void m1(int a) { System.out.println("int arg method"); }
	 */

	public void m1(float f) {
		System.out.println("flaot arg method");
	}

	public void m1(String name) {
		System.out.println("String method");
	}

}
public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		p.m1(10);
		p.m1(10.05f);
		p.m1("srinu");
		p.m1('a');
	}

}
