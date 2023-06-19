package com.jikim.effectivejava.chap01.item01.userinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(100, 20, 44, 3);

		System.out.println(numbers);

		Comparator<Integer> desc = (o1, o2) -> o2 - o1;

		Collections.sort(numbers, desc);
		System.out.println(numbers);

		numbers.sort(desc.reversed());
		System.out.println(numbers);
	}
}
