package com.shine.ssi.util;

public class HelloWorld {

	public String sayHello(){
		return "Hello Maven!";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new HelloWorld().sayHello());

	}

}
