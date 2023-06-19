package com.jikim.effectivejava.chap01.item01._3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws
		ClassNotFoundException,
		NoSuchMethodException,
		InvocationTargetException,
		InstantiationException,
		IllegalAccessException {
		/*HelloService helloService = HelloServiceFactory.of("ko");
		System.out.println("helloService.hello() = " + helloService.hello());
		helloService = HelloServiceFactory.of("en");
		System.out.println("helloService.hello() = " + helloService.hello());

		HelloService interfaceStaticMethod = HelloService.of("ko");
		System.out.println("interfaceStaticMethod.hello() = " + interfaceStaticMethod.hello());
		interfaceStaticMethod = HelloService.of("en");
		System.out.println("interfaceStaticMethod.hello() = " + interfaceStaticMethod.hello());*/

		Class<?> aClass = Class.forName("com.jikim.effectivejava.chap01.item01._3.KoreanHelloService");
		Constructor<?> constructor = aClass.getConstructor();
		KoreanHelloService o = (KoreanHelloService)constructor.newInstance();
		System.out.println(o.hello());
	}
}
