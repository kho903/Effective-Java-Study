package com.jikim.effectivejava.chap01.item01._3;

public interface HelloService {

	String hello();

	static HelloService of(String lang) {
		if (lang.equals("ko")) {
			return new KoreanHelloService();
		} else {
			return new EnglishHelloService();
		}
	}
}
