package com.jikim.effectivejava.chap01.item01._3;

public class Main {

	public static void main(String[] args) {
		HelloService helloService = HelloServiceFactory.of("ko");
		System.out.println("helloService.hello() = " + helloService.hello());
		helloService = HelloServiceFactory.of("en");
		System.out.println("helloService.hello() = " + helloService.hello());

		HelloService interfaceStaticMethod = HelloService.of("ko");
		System.out.println("interfaceStaticMethod.hello() = " + interfaceStaticMethod.hello());
		interfaceStaticMethod = HelloService.of("en");
		System.out.println("interfaceStaticMethod.hello() = " + interfaceStaticMethod.hello());
	}
}
