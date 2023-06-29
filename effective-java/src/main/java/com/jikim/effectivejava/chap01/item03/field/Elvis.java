package com.jikim.effectivejava.chap01.item03.field;

import java.io.Serializable;

// 3-1 public static final 필드 방식의 싱글턴
public class Elvis implements IElvis, Serializable {
	/**
	 * 싱글톤 오브젝트
	 */
	public static final Elvis INSTANCE = new Elvis();

	private static boolean created;

	private Elvis() {
		// Reflection을 막기 위한 방법
		if (created) {
			throw new UnsupportedOperationException("Can't be created by constructor");
		}
		created = true;
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	public void sing() {
		System.out.println("I'll have a blue~ Christmas without you");
	}

	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}

	private Object readResolve() {
		// 원하는 Object를 리턴하도록
		// 역직렬화 방지
		return INSTANCE;
	}
}
