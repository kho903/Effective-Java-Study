package com.jikim.effectivejava.chap01.item01._3;

public class HelloServiceFactory {

	public static HelloService of(String lang) {
		if (lang.equals("ko")) {
			return new KoreanHelloService();
		} else {
			return new EnglishHelloService();
		}
	}
}
