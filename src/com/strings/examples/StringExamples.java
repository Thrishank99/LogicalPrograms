package com.strings.examples;

import java.util.Locale;

public class StringExamples {
	public static void main(String[] args) {
		String orginalString = "sreenivasarao";
		// System.out.println(orginalString);
		CharSequence str1 = orginalString.subSequence(0, 4);//sree
		String str2 = orginalString.substring(3);//enivasarao
		String str3 = orginalString.substring(2, 6);//eeni
		String str4 = orginalString.concat("vkp");//sreenivasaraovkp
		String str5 = orginalString.intern();//sreenivasarao
		String str6 = orginalString.replace('s', '$');//$reeniva$arao
		String str7 = orginalString.replace("arao", "$");//sreenivas$
		String str8 = orginalString.replaceAll("sreeni", "srinivasaraok");//srinivasaraokvasarao
		String str9 = orginalString.replaceFirst("o", "f");//sreenivasaraf
		String str10 = orginalString.toLowerCase();//sreenivasarao

		String str11 = orginalString.toString();//sreenivasarao
		String str12 = orginalString.toUpperCase();//SREENIVASARAO
		String str13 = orginalString.trim();//sreenivasarao to remove start and end spaces
		
		boolean b = true;
		Character ch = 'a';
		int i = 55;
		double d = 55;
		float f = 25;
		char[] ch2 = { 'A', 'B' };
		String str14 = orginalString.valueOf(ch2);//AB
		char str15 = orginalString.charAt(1);//s
		boolean str16 = orginalString.contains("sreenivasarao");//true
		boolean str17 = orginalString.equalsIgnoreCase("SREENIVASaRAO");//true
		byte[] get = orginalString.getBytes();//[B@15db9742
		int length = orginalString.length();//13
		String[] split = orginalString.split(",");
		
		
		for (String string : split) {
			System.out.println(string);// sr,ee,ni,va,sa,rao to print one by one
		}
		String[] split2 = orginalString.split("#");
		for (String str21 : split2) {
			System.out.println(str21);
		}
		boolean new1 = orginalString.startsWith("sree");// true
		char[] ch1 = orginalString.toCharArray();// to convert string to char[]
		boolean match = orginalString.matches("sreenivasarao");
		System.out.println(match);//true

	}

}
