package com.jikim.effectivejava.chap01.item02.builder;

// 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취함.
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
		private final int servingSize;
		private final int servings;

		private int calories		= 0;
		private int fat				= 0;
		private int sodium			= 0;
		private int carbohydrate	= 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new Builder(240, 8)
			.calories(100)
			.sodium(35)
			.carbohydrate(27)
			.build();
	}
}
