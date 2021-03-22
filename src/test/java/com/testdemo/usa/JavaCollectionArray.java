package com.testdemo.usa;

public class JavaCollectionArray {

	public static void main(String[] args) {
		
		String s = new String ("Minhaj");
		
		System.out.println(s.charAt(3));
		System.out.println(s.concat(""));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		
		String b = new String ("Minhaj");
		System.out.println(s.equals(b));
		System.out.println(s.compareTo(b));
		System.out.println(s.substring(3));
		String r = new StringBuffer(s).reverse().toString();
		System.out.println(r);
		
		

	}

}
