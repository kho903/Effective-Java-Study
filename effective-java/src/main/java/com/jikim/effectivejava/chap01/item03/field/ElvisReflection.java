package com.jikim.effectivejava.chap01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 생성자로 여러 인스턴스 만들기
public class ElvisReflection {

	public static void main(String[] args) {
		try {
			Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
			defaultConstructor.setAccessible(true);
			Elvis elvis1 = defaultConstructor.newInstance(); // Elvis에 created 인스턴스 추가 후 UnsupportedOperationException 발생.
			Elvis elvis2 = defaultConstructor.newInstance();
			System.out.println(elvis1 == elvis2); // false
			System.out.println(elvis1 == Elvis.INSTANCE); // false
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}
}
