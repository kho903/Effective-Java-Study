package com.jikim.effectivejava.chap01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

// 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취함.
// 롬복 빌더 사용해 더 간결하게 표현 가능.
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 생성자 호출을 막기 위함.
public class NutritionFactsLombok {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static void main(String[] args) {
		NutritionFactsLombok nutritionFactsLombok
			= new NutritionFactsLombokBuilder()
					.servingSize(100)
					.servings(10)
					.build();
	}
}
