package com.jikim.effectivejava.chap01.item01;

public class Main {
	public static void main(String[] args) {
		// 장점 2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 됨.
		Settings settings1 = Settings.getInstance();
		Settings settings2 = Settings.getInstance();

		System.out.println(settings1);
		System.out.println(settings2);

		System.out.println(Boolean.valueOf(false));
		System.out.println(Boolean.valueOf(true));
	}
}
