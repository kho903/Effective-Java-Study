package com.jikim.effectivejava.chap01.item01.userinterface;

public interface HelloService {

	String hello();

	static String hi() {
		prepareMessage();
		return "hi";
	}

	static String hi2() {
		prepareMessage();
		return "hi";
	}

	default String bye() {
		return "bye";
	}

	static private void prepareMessage() {
	}
}
