package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void expectedHolaHola() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Hola Hola",helloWorldService.getHelloMessage());
		assertEquals("Hello Hello", helloWorldService.getHelloMessage());	
	}
	
}
