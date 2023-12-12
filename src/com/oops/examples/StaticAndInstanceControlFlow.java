package com.oops.examples;

public class StaticAndInstanceControlFlow {
	int x=100;
	static int i=10;
	static
	{
		
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	StaticAndInstanceControlFlow(){
		System.out.println("constructer");
	}
	public static  void m1(){
		System.out.println("it is static m1 method");
	}
	public  void m2(){
		System.out.println("it is instance m1 method");
	}
	static
	{
		System.out.println("second static block");
	}
	{
		System.out.println("second instance block");
	}
	public static void main(String[] args) {
		System.out.println(i);
		
		// TODO Auto-generated method stub
		StaticAndInstanceControlFlow sicf=new StaticAndInstanceControlFlow();
		System.out.println(sicf.x);
		sicf.m1();
		sicf.m2();
		
		
		
	
	}

}
