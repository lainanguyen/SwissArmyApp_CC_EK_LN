package com.example.swissarmyapp;

public class SettingsSingleton {
    private static Boolean colorChecked = false;
    private static Boolean fontChecked = false;


    private static String backgroundColor = HelloApplication.class.getResource("/whitemode.css").toExternalForm();
    private static String font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();


    public static Boolean getColorChecked() {
        return colorChecked;
    }
    public static void setColorChecked(Boolean colorChecked) {
        SettingsSingleton.colorChecked = colorChecked;
        System.out.println("I got flipped!");
    }


    public static Boolean getFontChecked() {return fontChecked;}
    public static void setFontChecked(Boolean fontChecked) {
        SettingsSingleton.fontChecked = fontChecked;
    }

    public static String getBackgroundColor() {
        return backgroundColor;
    }
    public static void setBackgroundColor(String backgroundColor) {
        SettingsSingleton.backgroundColor = backgroundColor;
    }

    public static String getFont() {
        return font;
    }
    public static void setFont(String font) {
        SettingsSingleton.font = font;
    }

}
