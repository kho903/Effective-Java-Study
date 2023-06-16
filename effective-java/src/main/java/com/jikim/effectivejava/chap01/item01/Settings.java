package com.jikim.effectivejava.chap01.item01;

public class Settings {

	private boolean useAutoSettings;

	private boolean useABS;

	private Difficulty difficulty;

	private Settings() {}

	private static final Settings SETTINGS = new Settings();

	public static Settings newInstance() {
		return SETTINGS;
	}
}
