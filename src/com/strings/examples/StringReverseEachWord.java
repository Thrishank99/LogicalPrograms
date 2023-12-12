package com.strings.examples;

public class StringReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java coding example";
		
		String words[]=str.split(" ");
		
		String reverse="";
		/*
		 * for(int x=words.length-1;x>=0;x--) { reverse=reverse+words[x]+" "; }
		 * System.out.println(reverse);//example coding java
		 */	
	
	  
	  for(int i=0;i<words.length;i++) {
		  String word=words[i];
	  String reverseword="";
	  for(int
	  j=word.length()-1;j>=0;j--) 
	  { reverseword=reverseword+word.charAt(j);
	  }
	  reverse=reverse+reverseword+" "; }
	  
	  System.out.println(reverse);
	 //avaj gnidoc elpmaxe 
	}

}
