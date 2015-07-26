package com.xth.ws.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xth.ws.server.HelloWorld;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-cxf.xml");
		HelloWorld client = (HelloWorld) context.getBean("helloClient");
		String respose = client.sayHi("lucas");
		System.out.println(respose);
	}
}
