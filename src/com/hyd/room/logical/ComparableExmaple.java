package com.hyd.room.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExmaple{

	public static void main(String[] args) {
		//List<Student> list=new ArrayList<Student>();
		ArrayList <Student> list=new ArrayList<Student>();  
		list.add(new Student(825,"srinu",4));
		list.add(new Student(100,"srinu",25));
		list.add(new Student(10,"srinu",30));
		list.add(new Student(180,"srinu",11));
		System.out.println(list);
		Collections.sort( list);
		System.out.println(list);
		for (Student s : list) {
			System.out.println(s.getStudentId()+s.getStudentName()+s.getAge());
			
		}
		
	}

}
