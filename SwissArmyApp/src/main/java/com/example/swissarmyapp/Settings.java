package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;


public class Settings {
    @FXML
    private ToggleButton colorToggle;

//    @FXML
//    protected void changeAppColor() {
//        //scene.getStylesheets().add(HelloApplication.class.getResource("/colorchange.css").toExternalForm());
//
//    }

    @FXML
    protected void changeAppColor() {
        if (colorToggle.isSelected()) {

        }
        //scene.getStylesheets().add(HelloApplication.class.getResource("/colorchange.css").toExternalForm());
    }


}
