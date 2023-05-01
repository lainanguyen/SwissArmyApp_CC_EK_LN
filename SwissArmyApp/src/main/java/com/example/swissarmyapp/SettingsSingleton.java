package com.example.swissarmyapp;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SettingsSingleton {
    private static Boolean colorChecked = false;
    private static Boolean fontChecked = false;
    private static Boolean buttonChecked = false;


    private static Boolean iconChecked = false;


    private static String backgroundColor = HelloApplication.class.getResource("/whitemode.css").toExternalForm();
    private static String font = HelloApplication.class.getResource("/systemfont.css").toExternalForm();
    private static String button = HelloApplication.class.getResource("/land.css").toExternalForm();


    static String image = "/petcaugh.gif";
    public static void setImage(ImageView icon) {
        if (SettingsSingleton.iconChecked) {
            icon.setImage(new Image(SettingsSingleton.image));
        } else {
            icon.setImage(null);
        }
    }


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


    public static Boolean getIconChecked() {
        return iconChecked;
    }
    public static void setIconChecked(Boolean iconChecked) {
        SettingsSingleton.iconChecked = iconChecked;
    }



}
