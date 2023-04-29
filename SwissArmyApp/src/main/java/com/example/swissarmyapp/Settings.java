package com.example.swissarmyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;


public class Settings {

    //change name
    @FXML
    private Label showName;

    @FXML
    private TextField changeName;

    //Changes the users name 
    @FXML
    public void changeNameButton() {
        String name = changeName.getText();
        ActivityPage.userName = name;
        showName.setText("your name is change to: " + name);
    }




    @FXML
    private ToggleButton colorToggle;

    @FXML
    private boolean redMode = false;

    @FXML
    private boolean fontType = false;

    public boolean isRedMode() {
        return redMode;
    }

    public boolean isFontType() {
        return fontType;
    }

    String backgroundColor = this.getClass().getResource("/whitemode.css").toExternalForm();
    String font = this.getClass().getResource("/systemfont.css").toExternalForm();


    @FXML
    public void changeColor(ActionEvent event) throws IOException {
        redMode = !redMode;
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (redMode) {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            scene.getStylesheets().add(this.getClass().getResource("/redmode.css").toExternalForm());
            backgroundColor = this.getClass().getResource("/redmode.css").toExternalForm();
        } else {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(this.getClass().getResource("/whitemode.css").toExternalForm());
            backgroundColor = this.getClass().getResource("/whitemode.css").toExternalForm();
        }
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void changeFont(ActionEvent event) throws IOException {
        fontType = !fontType;
        FXMLLoader fxmlLoader = new FXMLLoader(Madlibs.class.getResource("setting1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (fontType) {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            font = this.getClass().getResource("/raleway.css").toExternalForm();

        } else {
            //scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            font = this.getClass().getResource("/systemfont.css").toExternalForm();
        }
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void backToActivities (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LandingPage.class.getResource("activitypage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1206, 790);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (redMode) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
        }
        if (fontType) {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
            scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
        }
        //settingsChecker(scene);
        stage.setTitle("ActivityPage");
        stage.setScene(scene);
        stage.show();
        ActivityPage activityPage = fxmlLoader.getController();
        activityPage.onBack();
    }

//    public void settingsChecker(Scene scene) {
//        if (redMode) {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//        } else {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/redmode.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/whitemode.css").toExternalForm());
//        }
//        if (fontType) {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/raleway.css").toExternalForm());
//        } else {
//            scene.getStylesheets().remove(HelloApplication.class.getResource("/raleway.css").toExternalForm());
//            scene.getStylesheets().add(HelloApplication.class.getResource("/systemfont.css").toExternalForm());
//        }
//
//    }

}




