package com.example.swissarmyapp;

public class SettingsSingleton {
    private static Boolean colorChecked = false;
    private static Boolean fontChecked = false;
    private static Boolean buttonChecked = false;
    private static Boolean weightChecked = false;


    private static String backgroundColor = HelloApplication.class.getResource("/whitemode.css").toExternalForm();
    private static String font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();
    private static String button = HelloApplication.class.getResource("/land.css").toExternalForm();
    private static String weight = HelloApplication.class.getResource("/radiusdefault.css").toExternalForm();



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

    public static Boolean getButtonChecked() {
        return buttonChecked;
    }
    public static void setButtonChecked(Boolean buttonChecked) {
        SettingsSingleton.buttonChecked = buttonChecked;
    }

    public static String getButton() {
        return button;
    }
    public static void setButton(String button) {
        SettingsSingleton.button = button;
    }



    public static String getWeight() {
        return weight;
    }
    public static void setWeight(String weight) {
        SettingsSingleton.weight = weight;
    }
    public static Boolean getWeightChecked() {
        return weightChecked;
    }
    public static void setWeightChecked(Boolean weightChecked) {
        SettingsSingleton.weightChecked = weightChecked;
    }



}
