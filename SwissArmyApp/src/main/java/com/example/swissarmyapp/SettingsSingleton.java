package com.example.swissarmyapp;

public class SettingsSingleton {
    private static Boolean colorChecked = false;

    public static Boolean getColorChecked() {
        return colorChecked;
    }

    public static void setColorChecked(Boolean colorChecked) {
        SettingsSingleton.colorChecked = colorChecked;
        System.out.println("I got flipped!");
    }
}
