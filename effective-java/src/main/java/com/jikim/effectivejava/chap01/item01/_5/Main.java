package com.jikim.effectivejava.chap01.item01._5;

import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
	public static void main(String[] args) {
		ServiceLoader<HelloService2> loader = ServiceLoader.load(HelloService2.class);
		Optional<HelloService2> helloServiceOptional = loader.findFirst();
		helloServiceOptional.ifPresent(h -> {
			System.out.println(h.hello());
		});
	}
}
