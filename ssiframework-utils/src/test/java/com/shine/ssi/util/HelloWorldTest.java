package com.shine.ssi.util;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void testSayHello(){
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.sayHello();
		Assert.assertEquals("Hello Maven!", result);
	}

}
