package com.example.effectivejava.chapter01.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    public Difficulty difficulty;

    private Settings(){}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }
}
