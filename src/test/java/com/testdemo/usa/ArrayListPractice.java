package com.testdemo.usa;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Test1");
		a.add("Test2");
		a.add("Test3");
		a.add("Test4");
		a.add("Test5");
		
		for(int i=0; i < a.size(); i++){
		System.out.println(a.get(i));
		
		System.out.println(a);
		System.out.println(a.size());
		
		}

	}

	

}
